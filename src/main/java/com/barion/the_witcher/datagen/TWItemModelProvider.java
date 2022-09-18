package com.barion.the_witcher.datagen;

import com.ametrinstudios.ametrin.datagen.ExtendedItemModelProvider;
import com.barion.the_witcher.TheWitcher;
import com.barion.the_witcher.world.TWItems;
import com.barion.the_witcher.world.block.TWIcicleBlock;
import com.barion.the_witcher.world.block.TWPowerBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TWItemModelProvider extends ExtendedItemModelProvider {
    private final ModelFile bigHandheld = getExistingFile(modLoc("item/big_sword"));

    public TWItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper) {super(generator, TheWitcher.ModID, fileHelper);}

    {
        blockItemModelProviderRules.add((item, block, name, texture)->{
           if(!(block instanceof TWIcicleBlock)) {return false;}
           blockItem(name, getExistingFile(mcLoc("item/pointed_dripstone")), texture + "/down/tip");
           return true;
        });
        blockItemModelProviderRules.add((item, block, name, texture)->{
           if(!(block instanceof TWPowerBlock)) {return false;}
           withExistingParent(name, modLoc(BLOCK_FOLDER + "/" + name + "/on"));
           return true;
        });
        prorityItemModelProviderRules.add((item, name, texture)->{
           if(!(item instanceof SwordItem)) {return false;}
            item(name, bigHandheld, texture);
           return true;
        });
    }

    @Override
    protected void registerModels() {
        runProviderRules(TWItems.getAllItems());
    }

    private void blockItem(String name, ModelFile parent, String texture) {getBuilder(name).parent(parent).texture("layer0", blockLoc(texture));}
}