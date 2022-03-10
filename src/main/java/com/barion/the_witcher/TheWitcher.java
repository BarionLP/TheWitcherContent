package com.barion.the_witcher;

import com.barion.the_witcher.datagen.*;
import com.barion.the_witcher.world.TWBlocks;
import com.barion.the_witcher.world.TWEntities;
import com.barion.the_witcher.world.TWItems;
import com.barion.the_witcher.world.gen.TWFeatures;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TheWitcher.ModID)
public class TheWitcher {
    public static final String ModID = "the_witcher";
    public static final Logger LOGGER = LogManager.getLogger();

    public TheWitcher() {
        final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        TWItems.Registry.register(modBus);
        TWBlocks.Registry.register(modBus);
        TWEntities.Registry.register(modBus);
        TWFeatures.Registry.register(modBus);

        modBus.addListener(this::setup);
        modBus.addListener(TWEvents::regAttributes);
        modBus.addListener(TWEvents::regRenderers);

        final IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        forgeBus.register(this);
        forgeBus.addListener(TWEvents::onBiomeLoad);
    }

    private void setup(final FMLCommonSetupEvent event) {TWEvents.registerOres();}

    @Mod.EventBusSubscriber(modid = TheWitcher.ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class DataGenerators {
        private DataGenerators() {}

        @SubscribeEvent
        public static void gatherData(GatherDataEvent event){
            DataGenerator generator = event.getGenerator();
            ExistingFileHelper fileHelper = event.getExistingFileHelper();
            generator.addProvider(new TWBlockStateProvider(generator, fileHelper));
            generator.addProvider(new TWItemModelProvider(generator, fileHelper));
            BlockTagsProvider blockTags = new TWBlockTagsProvider(generator, fileHelper);
            generator.addProvider(blockTags);
            generator.addProvider(new TWItemTagsProvider(generator, blockTags, fileHelper));
            generator.addProvider(new TWEntityTypeTagsProvider(generator, fileHelper));
            generator.addProvider(new TWLootTableProvider(generator));
            generator.addProvider(new TWRecipeProvider(generator));
        }
    }
}