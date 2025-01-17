package com.barion.the_witcher.datagen;

import com.barion.the_witcher.TheWitcher;
import com.barion.the_witcher.util.TWTags;
import com.barion.the_witcher.world.TWEntityTypes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class TWEntityTypeTagsProvider extends EntityTypeTagsProvider {
    public TWEntityTypeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheWitcher.ModID, existingFileHelper);
    }

    @Override
    protected void addTags(@Nonnull HolderLookup.Provider lookupProvider){
        tag(TWTags.EntityTypes.MagicMob).add(
                EntityType.VEX,
                EntityType.CREEPER,
                TWEntityTypes.WildHuntHound.get(),
                TWEntityTypes.IceGhost.get()
        );

        tag(TWTags.EntityTypes.WildHunt).add(
                TWEntityTypes.WildHuntHound.get(),
                TWEntityTypes.WildHuntKnight.get()
        );

        tag(TWTags.EntityTypes.WildHuntIgnore).addTag(TWTags.EntityTypes.WildHunt).add(
                EntityType.AXOLOTL,
                EntityType.BEE,
                EntityType.CREEPER,
                EntityType.DOLPHIN,
                EntityType.FOX,
                EntityType.POLAR_BEAR,
                EntityType.PARROT,
                EntityType.SKELETON_HORSE
        );

        tag(EntityTypeTags.FREEZE_IMMUNE_ENTITY_TYPES).add(
                TWEntityTypes.WildHuntHound.get(),
                TWEntityTypes.WildHuntKnight.get(),
                TWEntityTypes.IceGhost.get()
        );
        tag(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS).add(
                TWEntityTypes.WildHuntHound.get(),
                TWEntityTypes.IceGhost.get()
        );
    }
}