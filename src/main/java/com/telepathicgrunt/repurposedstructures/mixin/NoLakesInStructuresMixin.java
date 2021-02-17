package com.telepathicgrunt.repurposedstructures.mixin;

import com.telepathicgrunt.repurposedstructures.modinit.RSStructureTagMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.feature.LakesFeature;
import net.minecraft.world.gen.feature.structure.Structure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;


@Mixin(LakesFeature.class)
public class NoLakesInStructuresMixin {

    @Inject(
            method = "generate",
            at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/util/math/BlockPos;down(I)Lnet/minecraft/util/math/BlockPos;"),
            cancellable = true
    )
    private void checkForRSVillages(ISeedReader serverWorldAccess, ChunkGenerator chunkGenerator, Random random, BlockPos blockPos, BlockStateFeatureConfig singleStateFeatureConfig, CallbackInfoReturnable<Boolean> cir) {

        for (Structure<?> structure : RSStructureTagMap.REVERSED_TAGGED_STRUCTURES.get(RSStructureTagMap.STRUCTURE_TAGS.NO_LAKES)) {
            if (serverWorldAccess.getStructures(SectionPos.from(blockPos), structure).findAny().isPresent()) {
                cir.setReturnValue(false);
                break;
            }
        }
    }
}