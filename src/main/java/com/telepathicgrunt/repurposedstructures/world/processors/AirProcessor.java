package com.telepathicgrunt.repurposedstructures.world.processors;

import com.mojang.serialization.Codec;
import com.telepathicgrunt.repurposedstructures.modinit.RSProcessors;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.gen.feature.template.IStructureProcessorType;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.StructureProcessor;
import net.minecraft.world.gen.feature.template.Template;

/**
 * FOR ELEMENTS USING legacy_single_pool_element AND WANTS AIR TO REPLACE TERRAIN.
 */
public class AirProcessor extends StructureProcessor {

    public static final AirProcessor INSTANCE = new AirProcessor();
    public static final Codec<AirProcessor> CODEC = Codec.unit(() -> INSTANCE);
    private AirProcessor() { }

    public Template.BlockInfo process(IWorldReader worldView, BlockPos pos, BlockPos blockPos, Template.BlockInfo structureBlockInfoRelative, Template.BlockInfo structureBlockInfo2Global, PlacementSettings structurePlacementData) {
        if (structureBlockInfo2Global.state.isIn(Blocks.AIR)) {
            worldView.getChunk(structureBlockInfo2Global.pos).setBlockState(structureBlockInfo2Global.pos, Blocks.AIR.getDefaultState(), false);
        }
        return structureBlockInfo2Global;
    }

    protected IStructureProcessorType<?> getType() {
        return RSProcessors.AIR_PROCESSORS;
    }
}