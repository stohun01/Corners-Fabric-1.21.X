package net.stohun.corners;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.stohun.corners.datagen.CornersModelProvider;
import net.stohun.corners.datagen.CornersLootTableProvider;

public class CornersDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(CornersModelProvider::new);
		pack.addProvider(CornersLootTableProvider::new);
	}
}