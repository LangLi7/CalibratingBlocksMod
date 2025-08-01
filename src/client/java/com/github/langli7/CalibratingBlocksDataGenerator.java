package com.github.langli7;

import com.github.langli7.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CalibratingBlocksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		//pack.addProvider(BlockTagProvider::new);
		//pack.addProvider(ItemTagProvider::new);
		//pack.addProvider(LootTableProvider::new);
		//pack.addProvider(ModelProvider::new);
		//pack.addProvider(AdvancementProvider::new);
		//pack.addProvider(RecipeProvider::new);
	}
}
