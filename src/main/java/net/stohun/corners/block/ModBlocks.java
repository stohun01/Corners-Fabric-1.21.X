package net.stohun.corners.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stohun.corners.Corners;

public class ModBlocks {

    public static final CornerBlock OAK_CORNER = (CornerBlock) registerBlock("oak_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final CornerBlock SPRUCE_CORNER = (CornerBlock) registerBlock("spruce_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));

    public static final CornerBlock BIRCH_CORNER = (CornerBlock) registerBlock("birch_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));

    public static final CornerBlock JUNGLE_CORNER = (CornerBlock) registerBlock("jungle_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));

    public static final CornerBlock ACACIA_CORNER = (CornerBlock) registerBlock("acacia_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));

    public static final CornerBlock DARK_OAK_CORNER = (CornerBlock) registerBlock("dark_oak_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));

    public static final CornerBlock MANGROVE_CORNER = (CornerBlock) registerBlock("mangrove_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));

    public static final CornerBlock CHERRY_CORNER = (CornerBlock) registerBlock("cherry_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));

    public static final CornerBlock BAMBOO_CORNER = (CornerBlock) registerBlock("bamboo_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

    public static final CornerBlock CRIMSON_CORNER = (CornerBlock) registerBlock("crimson_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));

    public static final CornerBlock WARPED_CORNER = (CornerBlock) registerBlock("warped_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    public static final CornerBlock STONE_CORNER = (CornerBlock) registerBlock("stone_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final CornerBlock COBBLESTONE_CORNER = (CornerBlock) registerBlock("cobblestone_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    public static final CornerBlock MOSSY_COBBLESTONE_CORNER = (CornerBlock) registerBlock("mossy_cobblestone_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final CornerBlock SMOOTH_STONE_CORNER = (CornerBlock) registerBlock("smooth_stone_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));

    public static final CornerBlock BRICK_CORNER = (CornerBlock) registerBlock("brick_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));

    public static final CornerBlock SANDSTONE_CORNER = (CornerBlock) registerBlock("sandstone_corner", new CornerBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));



    private static Block registerBlock(String name, Block block) {

        Registry.register(Registries.BLOCK,Identifier.of(Corners.MOD_ID, name),block);

        Registry.register(Registries.ITEM, Identifier.of(Corners.MOD_ID, name), new BlockItem(block, new Item.Settings()));

        return block;
    }

    public static void registerModBlocks() {
        Corners.LOGGER.info("Registering Mod Blocks for " + Corners.MOD_ID);

        FlammableBlockRegistry.getDefaultInstance().add(OAK_CORNER, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SPRUCE_CORNER, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BIRCH_CORNER, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(JUNGLE_CORNER, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ACACIA_CORNER, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DARK_OAK_CORNER, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(MANGROVE_CORNER, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CHERRY_CORNER, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BAMBOO_CORNER, 5, 20);

        // 5 corners smelt 1 item
        FuelRegistry.INSTANCE.add(OAK_CORNER, 40);
        FuelRegistry.INSTANCE.add(SPRUCE_CORNER, 40);
        FuelRegistry.INSTANCE.add(BIRCH_CORNER, 40);
        FuelRegistry.INSTANCE.add(JUNGLE_CORNER, 40);
        FuelRegistry.INSTANCE.add(ACACIA_CORNER, 40);
        FuelRegistry.INSTANCE.add(DARK_OAK_CORNER, 40);
        FuelRegistry.INSTANCE.add(MANGROVE_CORNER, 40);
        FuelRegistry.INSTANCE.add(CHERRY_CORNER, 40);
        FuelRegistry.INSTANCE.add(BAMBOO_CORNER, 40);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(OAK_CORNER);
            entries.add(SPRUCE_CORNER);
            entries.add(BIRCH_CORNER);
            entries.add(JUNGLE_CORNER);
            entries.add(ACACIA_CORNER);
            entries.add(DARK_OAK_CORNER);
            entries.add(MANGROVE_CORNER);
            entries.add(CHERRY_CORNER);
            entries.add(BAMBOO_CORNER);
            entries.add(CRIMSON_CORNER);
            entries.add(WARPED_CORNER);

            entries.add(STONE_CORNER);
            entries.add(COBBLESTONE_CORNER);
            entries.add(MOSSY_COBBLESTONE_CORNER);
            entries.add(SMOOTH_STONE_CORNER);

            entries.add(BRICK_CORNER);
            entries.add(SANDSTONE_CORNER);
        });
    }
}