package com.telepathicgrunt.repurposedstructures.world.structures.pieces;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import net.minecraft.block.Blocks;
import net.minecraft.block.PaneBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.jigsaw.*;
import net.minecraft.world.gen.feature.template.*;

@SuppressWarnings("deprecation")
public class VillageDarkForestPools
{
    public static void init() {
    }

    static {
	
       ImmutableList<StructureProcessor> zombiefy = ImmutableList.of(new RuleStructureProcessor(
	       ImmutableList.of(
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.8F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()),
		       new RuleEntry(new TagMatchRuleTest(BlockTags.DOORS), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()),
		       new RuleEntry(new BlockMatchRuleTest(Blocks.TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()),
		       new RuleEntry(new BlockMatchRuleTest(Blocks.WALL_TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.MOSSY_COBBLESTONE, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHITE_TERRACOTTA, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.DARK_OAK_LOG, 0.05F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.DARK_OAK_PLANKS, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.DARK_OAK_STAIRS, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.STRIPPED_DARK_OAK_LOG, 0.02F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.GLASS_PANE, 0.5F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()),
		       new RuleEntry(new BlockStateMatchRuleTest(Blocks.GLASS_PANE.getDefaultState().with(PaneBlock.NORTH, true).with(PaneBlock.SOUTH, true)), AlwaysTrueRuleTest.INSTANCE, Blocks.BROWN_STAINED_GLASS_PANE.getDefaultState().with(PaneBlock.NORTH, true).with(PaneBlock.SOUTH, true)),
		       new RuleEntry(new BlockStateMatchRuleTest(Blocks.GLASS_PANE.getDefaultState().with(PaneBlock.EAST, true).with(PaneBlock.WEST, true)), AlwaysTrueRuleTest.INSTANCE, Blocks.BROWN_STAINED_GLASS_PANE.getDefaultState().with(PaneBlock.EAST, true).with(PaneBlock.WEST, true)),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.3F), AlwaysTrueRuleTest.INSTANCE, Blocks.CARROTS.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.POTATOES.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()))));
       
       ImmutableList<StructureProcessor> mossify = ImmutableList.of(new RuleStructureProcessor(
	       ImmutableList.of(
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))));

       ImmutableList<StructureProcessor> path_randomizer = ImmutableList.of(new RuleStructureProcessor(
	       ImmutableList.of(
		       new RuleEntry(new BlockMatchRuleTest(Blocks.GRASS_PATH), new BlockMatchRuleTest(Blocks.WATER), Blocks.DARK_OAK_PLANKS.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.GRASS_PATH, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_BLOCK.getDefaultState()),
		       new RuleEntry(new BlockMatchRuleTest(Blocks.GRASS_BLOCK), new BlockMatchRuleTest(Blocks.WATER), Blocks.WATER.getDefaultState()),
		       new RuleEntry(new BlockMatchRuleTest(Blocks.DIRT), new BlockMatchRuleTest(Blocks.WATER), Blocks.WATER.getDefaultState()),
				   new RuleEntry(new BlockMatchRuleTest(Blocks.DIRT), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_BLOCK.getDefaultState()))));

       ImmutableList<StructureProcessor> crop_randomizer = ImmutableList.of(new RuleStructureProcessor(
	       ImmutableList.of(
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.3F), AlwaysTrueRuleTest.INSTANCE, Blocks.CARROTS.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.POTATOES.getDefaultState()),
		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()))));
      
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/town_centers"), new ResourceLocation("empty"),
	       ImmutableList.of(new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/town_centers/fountain_01", ImmutableList.of(new RuleStructureProcessor(
        	       ImmutableList.of(
        		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 50),
        		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/town_centers/meeting_point_1", ImmutableList.of(new RuleStructureProcessor(
        	       ImmutableList.of(
        		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 50),
        		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/town_centers/meeting_point_2"), 50),
        		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/town_centers/meeting_point_3", ImmutableList.of(new RuleStructureProcessor(
        	       ImmutableList.of(
        		       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.7F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 50),
        		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/town_centers/fountain_01", zombiefy), 1),
        		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/town_centers/meeting_point_1", zombiefy), 1),
        		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/town_centers/meeting_point_2", zombiefy), 1),
        		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/town_centers/meeting_point_3", zombiefy), 1)),
	       JigsawPattern.PlacementBehaviour.RIGID));
       
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/streets"), new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/terminators"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/corner_01", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/corner_02", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/corner_03", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/straight_01", path_randomizer), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/straight_02", path_randomizer), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/straight_03", path_randomizer), 7),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/straight_04", path_randomizer), 7),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/straight_05", path_randomizer), 3),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/straight_06", path_randomizer), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/crossroad_01", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/crossroad_02", path_randomizer), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/crossroad_03", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/crossroad_04", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/crossroad_05", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/crossroad_06", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/streets/turn_01", path_randomizer), 3)),
	       JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
       
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/zombie/streets"), new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/terminators"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/corner_01", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/corner_02", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/corner_03", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/straight_01", path_randomizer), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/straight_02", path_randomizer), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/straight_03", path_randomizer), 7),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/straight_04", path_randomizer), 7),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/straight_05", path_randomizer), 3),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/straight_06", path_randomizer), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/crossroad_01", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/crossroad_02", path_randomizer), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/crossroad_03", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/crossroad_04", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/crossroad_05", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/crossroad_06", path_randomizer), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/streets/turn_01", path_randomizer), 3)),
	       JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
       
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/houses"), new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/terminators"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_house_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_house_2", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_house_3", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_house_4", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_house_5", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_house_6", mossify), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_house_7", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_house_8", mossify), 3),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/medium_house_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/medium_house_2", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/big_house_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/butcher_shop_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/butcher_shop_2", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/tool_smith_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/fletcher_house_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/shepherds_house_1"), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/armorer_house_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/fisher_cottage_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/tannery_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/cartographer_1", mossify), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/library_1", mossify), 5),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/library_2", mossify), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/masons_house_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/weaponsmith_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/temple_3", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/temple_4", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/stable_1", mossify), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/stable_2"), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/large_farm_1", crop_randomizer), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_farm_1", crop_randomizer), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/animal_pen_1"), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/animal_pen_2"), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/animal_pen_3"), 5),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/accessory_1"), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/meeting_point_4", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(
			       new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.7F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 3),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/meeting_point_5"), 1),
		       Pair.of(EmptyJigsawPiece.INSTANCE, 10)),
	       JigsawPattern.PlacementBehaviour.RIGID));
       
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/zombie/houses"), new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/terminators"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/small_house_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/small_house_2", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/small_house_3", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/small_house_4", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/small_house_5", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/small_house_6", zombiefy), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/small_house_7", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/small_house_8", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/medium_house_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/medium_house_2", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/big_house_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/butcher_shop_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/butcher_shop_2", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/tool_smith_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/fletcher_house_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/shepherds_house_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/armorer_house_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/fisher_cottage_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/tannery_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/cartographer_1", zombiefy), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/library_1", zombiefy), 3),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/library_2", zombiefy), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/masons_house_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/weaponsmith_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/temple_3", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/temple_4", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/stable_1", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/stable_2", zombiefy), 2),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/large_farm_1", zombiefy), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/small_farm_1", zombiefy), 4),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/animal_pen_1", zombiefy), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/houses/animal_pen_2", zombiefy), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/animal_pen_3", zombiefy), 5),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/meeting_point_4", zombiefy), 3),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/houses/meeting_point_5", zombiefy), 1),
		       Pair.of(EmptyJigsawPiece.INSTANCE, 10)),
	       JigsawPattern.PlacementBehaviour.RIGID));
      
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/terminators"), new ResourceLocation("empty"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/terminators/terminator_01", path_randomizer), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/terminators/terminator_02", path_randomizer), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/terminators/terminator_03", path_randomizer), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/terminators/terminator_04", path_randomizer), 1)),
	       JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));

       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/zombie/terminators"), new ResourceLocation("empty"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/terminators/terminator_01", path_randomizer), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/terminators/terminator_02", path_randomizer), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/terminators/terminator_03", path_randomizer), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/terminators/terminator_04", path_randomizer), 1)),
	       JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
       
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/trees"), new ResourceLocation("empty"),
	       ImmutableList.of(
		       new Pair<>(new FeatureJigsawPiece(Feature.field_236291_c_.configure(DefaultBiomeFeatures.DARK_OAK_TREE_CONFIG)), 1)),
	       JigsawPattern.PlacementBehaviour.RIGID));
       
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/decor"), new ResourceLocation("empty"),
	       ImmutableList.of(new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/decor/lamp_1"), 5),
		       new Pair<>(new FeatureJigsawPiece(Feature.field_236291_c_.configure(DefaultBiomeFeatures.DARK_OAK_TREE_CONFIG)), 1),
		       new Pair<>(new FeatureJigsawPiece(Feature.FLOWER.configure(DefaultBiomeFeatures.RED_MUSHROOM_CONFIG)), 1),
		       new Pair<>(new FeatureJigsawPiece(Feature.FLOWER.configure(DefaultBiomeFeatures.BROWN_MUSHROOM_CONFIG)), 1),
		       new Pair<>(new FeatureJigsawPiece(Feature.field_227244_A_.configure(DefaultBiomeFeatures.PUMPKIN_PILE_CONFIG)), 1),
		       Pair.of(EmptyJigsawPiece.INSTANCE, 2)),
	       JigsawPattern.PlacementBehaviour.RIGID));
      
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/zombie/decor"), new ResourceLocation("empty"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/decor/lamp_1", zombiefy), 1),
		       new Pair<>(new FeatureJigsawPiece(Feature.field_236291_c_.configure(DefaultBiomeFeatures.DARK_OAK_TREE_CONFIG)), 1),
		       new Pair<>(new FeatureJigsawPiece(Feature.FLOWER.configure(DefaultBiomeFeatures.RED_MUSHROOM_CONFIG)), 1),
		       new Pair<>(new FeatureJigsawPiece(Feature.FLOWER.configure(DefaultBiomeFeatures.BROWN_MUSHROOM_CONFIG)), 1),
		       new Pair<>(new FeatureJigsawPiece(Feature.field_227244_A_.configure(DefaultBiomeFeatures.PUMPKIN_PILE_CONFIG)), 1),
		       Pair.of(EmptyJigsawPiece.INSTANCE, 2)),
	       JigsawPattern.PlacementBehaviour.RIGID));
      
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/villagers"), new ResourceLocation("empty"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/villagers/nitwit"), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/villagers/baby"), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/villagers/unemployed"), 10)),
	       JigsawPattern.PlacementBehaviour.RIGID));
      
       JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(RepurposedStructures.MODID+":village/dark_forest/zombie/villagers"), new ResourceLocation("empty"),
	       ImmutableList.of(
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/villagers/nitwit"), 1),
		       new Pair<>(new SingleJigsawPiece(RepurposedStructures.MODID+":village/dark_forest/zombie/villagers/unemployed"), 10)),
	       JigsawPattern.PlacementBehaviour.RIGID));
    }
}