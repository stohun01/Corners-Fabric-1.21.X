package net.stohun.corners.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.stohun.corners.Corners;

public class ModBlocks {


    public static final CornerBlock OAK_CORNER = (CornerBlock) registerBlock("oak_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final CornerBlock SPRUCE_CORNER = (CornerBlock) registerBlock("spruce_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final CornerBlock BIRCH_CORNER = (CornerBlock) registerBlock("birch_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final CornerBlock JUNGLE_CORNER = (CornerBlock) registerBlock("jungle_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final CornerBlock ACACIA_CORNER = (CornerBlock) registerBlock("acacia_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final CornerBlock DARK_OAK_CORNER = (CornerBlock) registerBlock("dark_oak_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final CornerBlock MANGROVE_CORNER = (CornerBlock) registerBlock("mangrove_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final CornerBlock CHERRY_CORNER = (CornerBlock) registerBlock("cherry_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));

    public static final CornerBlock BAMBOO_CORNER = (CornerBlock) registerBlock("bamboo_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));

    public static final CornerBlock CRIMSON_CORNER = (CornerBlock) registerBlock("crimson_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DULL_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final CornerBlock WARPED_CORNER = (CornerBlock) registerBlock("warped_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final CornerBlock COBBLESTONE_CORNER = (CornerBlock) registerBlock("cobblestone_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final CornerBlock BRICK_CORNER = (CornerBlock) registerBlock("brick_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final CornerBlock SANDSTONE_CORNER = (CornerBlock) registerBlock("sandstone_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final CornerBlock STONE_CORNER = (CornerBlock) registerBlock("stone_corner",
            new CornerBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

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
            entries.add(COBBLESTONE_CORNER);
            entries.add(BRICK_CORNER);
            entries.add(SANDSTONE_CORNER);
            entries.add(STONE_CORNER);
        });
    }
}