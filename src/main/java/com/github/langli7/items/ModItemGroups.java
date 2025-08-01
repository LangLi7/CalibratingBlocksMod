package com.github.langli7.items;

import com.github.langli7.CalibratingBlocks;
import com.github.langli7.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CALIBRATING_BLOCKS_GROUPS = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(
                    CalibratingBlocks.MOD_ID,
                    "calibrating_blocks"
            ),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.BEACON))// <- Vanilla Beacon als icon
                    .displayName(Text.translatable("itemgroup.calibrating_blocks"))
                    .entries((displayContext, entries) -> {
                        //add blocks in Creative Taps
                        entries.add(ModBlocks.CALIBRATED_BEACON_BLOCK);

                    }).build()
    );

    public static void registerItemGroups(){
        CalibratingBlocks.LOGGER.info("Registering Item Groups for " + CalibratingBlocks.MOD_ID);
    }
}
