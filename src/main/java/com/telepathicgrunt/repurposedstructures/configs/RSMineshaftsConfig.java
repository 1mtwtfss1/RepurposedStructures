package com.telepathicgrunt.repurposedstructures.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class RSMineshaftsConfig {
    public static final ForgeConfigSpec GENERAL_SPEC;

    public static ForgeConfigSpec.DoubleValue birchMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue jungleMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue desertMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue stoneMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue savannaMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue icyMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue oceanMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue taigaMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue darkForestMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue swampMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue endMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue netherMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue crimsonMineshaftSpawnrate;
    public static ForgeConfigSpec.DoubleValue warpedMineshaftSpawnrate;

    public static ForgeConfigSpec.IntValue birchMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue jungleMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue desertMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue stoneMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue savannaMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue icyMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue oceanMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue taigaMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue darkForestMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue swampMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue netherMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue crimsonMineshaftMinHeight;
    public static ForgeConfigSpec.IntValue warpedMineshaftMinHeight;

    public static ForgeConfigSpec.IntValue birchMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue jungleMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue desertMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue stoneMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue savannaMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue icyMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue oceanMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue taigaMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue darkForestMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue swampMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue netherMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue crimsonMineshaftMaxHeight;
    public static ForgeConfigSpec.IntValue warpedMineshaftMaxHeight;

    public static ForgeConfigSpec.IntValue birchMineshaftSize;
    public static ForgeConfigSpec.IntValue jungleMineshaftSize;
    public static ForgeConfigSpec.IntValue desertMineshaftSize;
    public static ForgeConfigSpec.IntValue stoneMineshaftSize;
    public static ForgeConfigSpec.IntValue savannaMineshaftSize;
    public static ForgeConfigSpec.IntValue icyMineshaftSize;
    public static ForgeConfigSpec.IntValue oceanMineshaftSize;
    public static ForgeConfigSpec.IntValue taigaMineshaftSize;
    public static ForgeConfigSpec.IntValue darkForestMineshaftSize;
    public static ForgeConfigSpec.IntValue swampMineshaftSize;
    public static ForgeConfigSpec.IntValue endMineshaftSize;
    public static ForgeConfigSpec.IntValue netherMineshaftSize;
    public static ForgeConfigSpec.IntValue crimsonMineshaftSize;
    public static ForgeConfigSpec.IntValue warpedMineshaftSize;

    public static ForgeConfigSpec.IntValue endMineshaftMinIslandThickness;

    static {
        ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
        setupConfig(configBuilder);
        GENERAL_SPEC = configBuilder.build();
    }

    private static void setupConfig(ForgeConfigSpec.Builder builder) {

        builder.comment("-----------------------------------------------------------------------------------------",
                " Controls the probability of spawning a Repurposed Structures Mineshafts per chunk.",
                " Will replace Vanilla Mineshafts with RS's themed Mineshafts if both would've been in same biome.",
                " 0 is no Mineshafts while 1000 is max spawnrate.",
                " Note: Vanilla Mineshafts will spawn again if a RS Mineshafts's entry is set to 0 for the biome.");
        builder.push("Spawnrate");

        birchMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.birchmineshaftspawnrate")
                .defineInRange("birchMineshaftSpawnrate", 40D, 0, 1000);

        jungleMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.junglemineshaftspawnrate")
                .defineInRange("jungleMineshaftSpawnrate", 40D, 0, 1000);

        desertMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.desertmineshaftspawnrate")
                .defineInRange("desertMineshaftSpawnrate", 40D, 0, 1000);

        stoneMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.stonemineshaftspawnrate")
                .defineInRange("stoneMineshaftSpawnrate", 40D, 0, 1000);

        savannaMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.savannamineshaftspawnrate")
                .defineInRange("savannaMineshaftSpawnrate", 40D, 0, 1000);

        icyMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.icymineshaftspawnrate")
                .defineInRange("icyMineshaftSpawnrate", 40D, 0, 1000);

        oceanMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.oceanmineshaftspawnrate")
                .defineInRange("oceanMineshaftSpawnrate", 40D, 0, 1000);

        taigaMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.taigamineshaftspawnrate")
                .defineInRange("taigaMineshaftSpawnrate", 40D, 0, 1000);

        darkForestMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.darkforestmineshaftspawnrate")
                .defineInRange("darkForestMineshaftSpawnrate", 40D, 0, 1000);

        swampMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.swampmineshaftspawnrate")
                .defineInRange("swampMineshaftSpawnrate", 40D, 0, 1000);

        netherMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.nethermineshaftspawnrate")
                .defineInRange("netherMineshaftSpawnrate", 40D, 0, 1000);

        crimsonMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.crimsonmineshaftspawnrate")
                .defineInRange("crimsonMineshaftSpawnrate", 40D, 0, 1000);

        warpedMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.warpedmineshaftspawnrate")
                .defineInRange("warpedMineshaftSpawnrate", 40D, 0, 1000);

        endMineshaftSpawnrate = builder
                .translation("repurposedstructures.config.mineshaft.endmineshaftspawnrate")
                .defineInRange("endMineshaftSpawnrate", 60D, 0, 1000);

        builder.pop();

        builder.comment("-----------------------------------------------------------------------------------------",
                " Minimum Y height that this mineshaft can spawn at.",
                " Note: The mineshaft will spawn between min and max y height set in config.");
        builder.push("Min height");

        birchMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.birchmineshaftminheight")
                .defineInRange("birchMineshaftMinHeight", 8, 5, 255);

        jungleMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.junglemineshaftminheight")
                .defineInRange("jungleMineshaftMinHeight", 8, 5, 255);

        desertMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.desertmineshaftminheight")
                .defineInRange("desertMineshaftMinHeight", 8, 5, 255);

        stoneMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.stonemineshaftminheight")
                .defineInRange("stoneMineshaftMinHeight", 8, 5, 255);

        savannaMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.savannamineshaftminheight")
                .defineInRange("savannaMineshaftMinHeight", 8, 5, 255);

        icyMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.icymineshaftminheight")
                .defineInRange("icyMineshaftMinHeight", 8, 5, 255);

        oceanMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.oceanmineshaftminheight")
                .defineInRange("oceanMineshaftMinHeight", 8, 5, 255);

        taigaMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.taigamineshaftminheight")
                .defineInRange("taigaMineshaftMinHeight", 8, 5, 255);

        darkForestMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.darkforestmineshaftminheight")
                .defineInRange("darkForestMineshaftMinHeight", 8, 5, 255);

        swampMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.swampmineshaftminheight")
                .defineInRange("swampMineshaftMinHeight", 8, 5, 255);

        netherMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.nethermineshaftminheight")
                .defineInRange("netherMineshaftMinHeight", 6, 5, 255);

        crimsonMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.crimsonmineshaftminheight")
                .defineInRange("crimsonMineshaftMinHeight", 6, 5, 255);

        warpedMineshaftMinHeight = builder
                .translation("repurposedstructures.config.mineshaft.warpedmineshaftminheight")
                .defineInRange("warpedMineshaftMinHeight", 6, 5, 255);

        builder.pop();

        builder.comment("-----------------------------------------------------------------------------------------",
                " Maximum Y height that this mineshaft can spawn at.",
                " Note: The mineshaft will spawn between min and max y height set in config.",
                " Setting this to below min height config will make mineshaft spawn only at min height.");
        builder.push("Max height");

        birchMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.birchmineshaftmaxheight")
                .defineInRange("birchMineshaftMaxHeight", 45, 5, 255);

        jungleMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.junglemineshaftmaxheight")
                .defineInRange("jungleMineshaftMaxHeight", 45, 5, 255);

        desertMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.desertmineshaftmaxheight")
                .defineInRange("desertMineshaftMaxHeight", 45, 5, 255);

        stoneMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.stonemineshaftmaxheight")
                .defineInRange("stoneMineshaftMaxHeight", 45, 5, 255);

        savannaMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.savannamineshaftmaxheight")
                .defineInRange("savannaMineshaftMaxHeight", 45, 5, 255);

        icyMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.icymineshaftmaxheight")
                .defineInRange("icyMineshaftMaxHeight", 45, 5, 255);

        oceanMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.oceanmineshaftmaxheight")
                .defineInRange("oceanMineshaftMaxHeight", 26, 5, 255);

        taigaMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.taigamineshaftmaxheight")
                .defineInRange("taigaMineshaftMaxHeight", 45, 5, 255);

        darkForestMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.darkforestmineshaftmaxheight")
                .defineInRange("darkForestMineshaftMaxHeight", 45, 5, 255);

        swampMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.swampmineshaftmaxheight")
                .defineInRange("swampMineshaftMaxHeight", 45, 5, 255);

        netherMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.nethermineshaftmaxheight")
                .defineInRange("netherMineshaftMaxHeight", 17, 5, 255);

        crimsonMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.crimsonmineshaftmaxheight")
                .defineInRange("crimsonMineshaftMaxHeight", 14, 5, 255);

        warpedMineshaftMaxHeight = builder
                .translation("repurposedstructures.config.mineshaft.warpedmineshaftmaxheight")
                .defineInRange("warpedMineshaftMaxHeight", 14, 5, 255);

        builder.pop();

        builder.comment("-----------------------------------------------------------------------------------------",
                " Size of the mineshaft. This is how many pieces long a branch can be from the start piece.");
        builder.push("Size");

        birchMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.birchmineshaftsize")
                .defineInRange("birchMineshaftSize", 9, 1, 30);

        jungleMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.junglemineshaftsize")
                .defineInRange("jungleMineshaftSize", 9, 1, 30);

        desertMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.desertmineshaftsize")
                .defineInRange("desertMineshaftSize", 9, 1, 30);

        stoneMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.stonemineshaftsize")
                .defineInRange("stoneMineshaftSize", 9, 1, 30);

        savannaMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.savannamineshaftsize")
                .defineInRange("savannaMineshaftSize", 9, 1, 30);

        icyMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.icymineshaftsize")
                .defineInRange("icyMineshaftSize", 9, 1, 30);

        oceanMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.oceanmineshaftsize")
                .defineInRange("oceanMineshaftSize", 9, 1, 30);

        taigaMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.taigamineshaftsize")
                .defineInRange("taigaMineshaftSize", 9, 1, 30);

        darkForestMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.darkforestmineshaftsize")
                .defineInRange("darkForestMineshaftSize", 9, 1, 30);

        swampMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.swampmineshaftsize")
                .defineInRange("swampMineshaftSize", 9, 1, 30);

        endMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.endmineshaftsize")
                .defineInRange("endMineshaftSize", 11, 1, 30);

        netherMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.nethermineshaftsize")
                .defineInRange("netherMineshaftSize", 10, 1, 30);

        crimsonMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.crimsonmineshaftsize")
                .defineInRange("crimsonMineshaftSize", 10, 1, 30);

        warpedMineshaftSize = builder
                .translation("repurposedstructures.config.mineshaft.warpedmineshaftsize")
                .defineInRange("warpedMineshaftSize", 10, 1, 30);

        builder.pop();

        builder.push("Misc");

        endMineshaftMinIslandThickness = builder
                .comment("\n The minimum thickness of End islands that the End Mineshaft can spawn in.",
                        "So 30 means the End Mineshaft will spawn in land that is at least 30 blocks vertically in the area.",
                        "Do 0 to turn off this check and allow the End Mineshaft to spawn anywhere including floating in midair.")
                .translation("repurposedstructures.config.mineshaft.endMineshaftMinIslandThickness")
                .defineInRange("endMineshaftMinIslandThickness", 30, 0, 256);

        builder.pop();
    }
}
