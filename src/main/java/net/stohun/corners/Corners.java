package net.stohun.corners;

import net.fabricmc.api.ModInitializer;

import net.stohun.corners.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Corners implements ModInitializer {
	public static final String MOD_ID = "corners";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
