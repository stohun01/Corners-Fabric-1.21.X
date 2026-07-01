package net.stohun.corners.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.stohun.corners.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class CornersRecipeProvider extends FabricRecipeProvider {
    public CornersRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private record RecipeConfig(Block sourceBlock, Block customBlock) {}

    private static final RecipeConfig[] RECIPES = {
            new RecipeConfig(Blocks.OAK_PLANKS, ModBlocks.OAK_CORNER),
            new RecipeConfig(Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_CORNER),
            new RecipeConfig(Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_CORNER),
            new RecipeConfig(Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_CORNER),
            new RecipeConfig(Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_CORNER),
            new RecipeConfig(Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_CORNER),
            new RecipeConfig(Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_CORNER),
            new RecipeConfig(Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_CORNER),
            new RecipeConfig(Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_CORNER),
            new RecipeConfig(Blocks.BAMBOO_MOSAIC, ModBlocks.BAMBOO_MOSAIC_CORNER),
            new RecipeConfig(Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_CORNER),
            new RecipeConfig(Blocks.WARPED_PLANKS, ModBlocks.WARPED_CORNER),

            new RecipeConfig(Blocks.STONE, ModBlocks.STONE_CORNER),
            new RecipeConfig(Blocks.COBBLESTONE, ModBlocks.COBBLESTONE_CORNER),
            new RecipeConfig(Blocks.MOSSY_COBBLESTONE, ModBlocks.MOSSY_COBBLESTONE_CORNER),
            new RecipeConfig(Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_CORNER),
            new RecipeConfig(Blocks.STONE_BRICKS, ModBlocks.STONE_BRICK_CORNER),
            new RecipeConfig(Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE_BRICK_CORNER),
            new RecipeConfig(Blocks.GRANITE, ModBlocks.GRANITE_CORNER),
            new RecipeConfig(Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_CORNER),
            new RecipeConfig(Blocks.DIORITE, ModBlocks.DIORITE_CORNER),
            new RecipeConfig(Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_CORNER),
            new RecipeConfig(Blocks.ANDESITE, ModBlocks.ANDESITE_CORNER),
            new RecipeConfig(Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_CORNER),
            new RecipeConfig(Blocks.COBBLED_DEEPSLATE, ModBlocks.COBBLED_DEEPSLATE_CORNER),
            new RecipeConfig(Blocks.POLISHED_DEEPSLATE, ModBlocks.POLISHED_DEEPSLATE_CORNER),
            new RecipeConfig(Blocks.DEEPSLATE_BRICKS, ModBlocks.DEEPSLATE_BRICK_CORNER),
            new RecipeConfig(Blocks.DEEPSLATE_TILES, ModBlocks.DEEPSLATE_TILE_CORNER),
            new RecipeConfig(Blocks.TUFF, ModBlocks.TUFF_CORNER),
            new RecipeConfig(Blocks.POLISHED_TUFF, ModBlocks.POLISHED_TUFF_CORNER),
            new RecipeConfig(Blocks.TUFF_BRICKS, ModBlocks.TUFF_BRICK_CORNER),
            new RecipeConfig(Blocks.BRICKS, ModBlocks.BRICK_CORNER),
            new RecipeConfig(Blocks.MUD_BRICKS, ModBlocks.MUD_BRICK_CORNER),
            new RecipeConfig(Blocks.SANDSTONE, ModBlocks.SANDSTONE_CORNER),
            new RecipeConfig(Blocks.SMOOTH_SANDSTONE, ModBlocks.SMOOTH_SANDSTONE_CORNER),
            new RecipeConfig(Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_CORNER),
            new RecipeConfig(Blocks.RED_SANDSTONE, ModBlocks.RED_SANDSTONE_CORNER),
            new RecipeConfig(Blocks.SMOOTH_RED_SANDSTONE, ModBlocks.SMOOTH_RED_SANDSTONE_CORNER),
            new RecipeConfig(Blocks.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_CORNER),
            new RecipeConfig(Blocks.PRISMARINE, ModBlocks.PRISMARINE_CORNER),
            new RecipeConfig(Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_CORNER),
            new RecipeConfig(Blocks.DARK_PRISMARINE, ModBlocks.DARK_RISMARINE_CORNER),
            new RecipeConfig(Blocks.NETHER_BRICKS, ModBlocks.NETHER_BRICK_CORNER),
            new RecipeConfig(Blocks.RED_NETHER_BRICKS, ModBlocks.RED_NETHER_BRICK_CORNER),
            new RecipeConfig(Blocks.BLACKSTONE, ModBlocks.BLACKSTONE_CORNER),
            new RecipeConfig(Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_CORNER),
            new RecipeConfig(Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_CORNER),
            new RecipeConfig(Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_CORNER),
            new RecipeConfig(Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_CORNER),
            new RecipeConfig(Blocks.QUARTZ_BLOCK, ModBlocks.QUARTZ_CORNER),
            new RecipeConfig(Blocks.SMOOTH_QUARTZ, ModBlocks.SMOOTH_QUARTZ_CORNER),

            new RecipeConfig(Blocks.CUT_COPPER, ModBlocks.CUT_COPPER_CORNER),
            new RecipeConfig(Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_CUT_COPPER_CORNER),
            new RecipeConfig(Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_CUT_COPPER_CORNER),
            new RecipeConfig(Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_CUT_COPPER_CORNER),
            new RecipeConfig(Blocks.WAXED_CUT_COPPER, ModBlocks.WAXED_CUT_COPPER_CORNER),
            new RecipeConfig(Blocks.WAXED_EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_CUT_COPPER_CORNER),
            new RecipeConfig(Blocks.WAXED_WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_CUT_COPPER_CORNER),
            new RecipeConfig(Blocks.WAXED_OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_CORNER),
    };

    @Override
    public void generate(RecipeExporter exporter) {
        for (RecipeConfig recipe : RECIPES) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, recipe.customBlock(), 16)
                    .pattern("  #")
                    .pattern("   ")
                    .pattern("#  ")
                    .input('#', recipe.sourceBlock())
                    .criterion(hasItem(recipe.sourceBlock()), conditionsFromItem(recipe.sourceBlock()))
                    .offerTo(exporter);
        }
    }
}