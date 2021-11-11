package com.telepathicgrunt.repurposedstructures.biomeinjection;

import com.telepathicgrunt.repurposedstructures.configs.RSRuinsConfig;
import com.telepathicgrunt.repurposedstructures.modinit.RSConfiguredStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSStructures;
import com.telepathicgrunt.repurposedstructures.utils.BiomeSelection;
import net.minecraft.world.biome.Biome.Category;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public final class Ruins {
    private Ruins() {}

    public static void addRuins(BiomeLoadingEvent event) {

        if (RSRuinsConfig.ruinsNetherAverageChunkDistance.get() != 1001 &&
            BiomeSelection.isBiomeAllowed(event, RSStructures.RUINS_NETHER.get(),
                    () -> BiomeSelection.haveCategories(event, Category.NETHER)))
        {
            event.getGeneration().getStructures().add(() -> RSConfiguredStructures.RUINS_NETHER);
        }

        if (RSRuinsConfig.ruinsLandWarmAverageChunkDistance.get() != 1001 &&
            BiomeSelection.isBiomeAllowed(event, RSStructures.RUINS_LAND_WARM.get(),
                    () -> BiomeSelection.haveCategories(event, Category.PLAINS, Category.FOREST, Category.TAIGA, Category.SWAMP) &&
                    !BiomeSelection.hasName(event, "snow", "ice", "frozen") &&
                    event.getClimate().temperature >= 0.25f))
        {
            event.getGeneration().getStructures().add(() -> RSConfiguredStructures.RUINS_LAND_WARM);
        }

        if (RSRuinsConfig.ruinsLandHotAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, RSStructures.RUINS_LAND_HOT.get(),
                        () -> BiomeSelection.haveCategories(event, Category.DESERT)))
        {
            event.getGeneration().getStructures().add(() -> RSConfiguredStructures.RUINS_LAND_HOT);
        }
    }
}
