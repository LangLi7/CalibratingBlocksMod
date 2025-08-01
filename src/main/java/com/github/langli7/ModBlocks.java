package com.github.langli7;

import com.github.langli7.blocks.custom.CalibratedBeacon;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModBlocks {

    public static final Block CALIBRATED_BEACON_BLOCK = registerBlock("calibrated_beacon_block", new CalibratedBeacon(
            AbstractBlock.Settings.create()
                    .nonOpaque()
//                    .strength(4f)
//                    .sounds(BlockSoundGroup.STONE)
//                    .requiresTool()
            )
    );


    private static Block registerBlock(String block_name, Block block) {
        // BlockItem registrieren
        registerBlockItem(block_name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CalibratingBlocks.MOD_ID, block_name), block);
    }


    private static void registerBlockItem(String block_name, Block block) {
        Registry.register(
                Registries.ITEM,
                Identifier.of(
                        CalibratingBlocks.MOD_ID,
                        block_name
                ),
                new BlockItem(
                        block,
                        new Item.Settings()
                )
        );
    }

    public static void registerModBlocks() {
        CalibratingBlocks.LOGGER.info("Registering Mod Blocks for " + CalibratingBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CALIBRATED_BEACON_BLOCK);
        });
    }
}
