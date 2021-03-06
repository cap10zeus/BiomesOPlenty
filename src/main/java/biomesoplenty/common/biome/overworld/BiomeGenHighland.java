/*******************************************************************************
 * Copyright 2015-2016, the Biomes O' Plenty Team
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/

package biomesoplenty.common.biome.overworld;

import biomesoplenty.api.config.IBOPWorldSettings;
import biomesoplenty.api.config.IBOPWorldSettings.GeneratorType;
import biomesoplenty.api.enums.BOPClimates;
import biomesoplenty.api.generation.GeneratorStage;
import biomesoplenty.common.enums.BOPPlants;
import biomesoplenty.common.util.biome.GeneratorUtils.ScatterYMethod;
import biomesoplenty.common.world.generator.GeneratorBlobs;
import biomesoplenty.common.world.generator.GeneratorDoubleFlora;
import biomesoplenty.common.world.generator.GeneratorGrass;
import biomesoplenty.common.world.generator.GeneratorOreSingle;
import biomesoplenty.common.world.generator.GeneratorWeighted;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.init.Blocks;

public class BiomeGenHighland extends BOPBiome
{
        
    public BiomeGenHighland()
    {
        super("highland", new PropsBuilder("Highland").withGuiColour(0x7CAD66).withTemperature(0.55F).withRainfall(0.8F));

        // terrain
        this.terrainSettings.avgHeight(120).heightVariation(25, 25);
        
        this.canGenerateRivers = false;
        this.canGenerateVillages = false;
        
        this.addWeight(BOPClimates.COOL_TEMPERATE, 7);
        
        this.beachBiomeLocation = null;
        
        // boulders
        this.addGenerator("boulders", GeneratorStage.SAND, (new GeneratorBlobs.Builder()).amountPerChunk(0.5F).placeOn(Blocks.GRASS).with(Blocks.COBBLESTONE.getDefaultState()).minRadius(0.3F).maxRadius(1.2F).numBalls(1).scatterYMethod(ScatterYMethod.AT_SURFACE).create());
        this.addGenerator("big_boulders", GeneratorStage.SAND, (new GeneratorBlobs.Builder()).amountPerChunk(0.1F).placeOn(Blocks.GRASS).with(Blocks.COBBLESTONE.getDefaultState()).minRadius(0.3F).maxRadius(4.0F).numBalls(3).scatterYMethod(ScatterYMethod.AT_SURFACE).create());

        // grasses
        GeneratorWeighted grassGenerator = new GeneratorWeighted(10);
        this.addGenerator("grass", GeneratorStage.GRASS, grassGenerator);
        grassGenerator.add("shortgrass", 1, (new GeneratorGrass.Builder()).with(BOPPlants.SHORTGRASS).create());
        grassGenerator.add("mediumgrass", 1, (new GeneratorGrass.Builder()).with(BOPPlants.MEDIUMGRASS).create());
        grassGenerator.add("wheatgrass", 1, (new GeneratorGrass.Builder()).with(BOPPlants.WHEATGRASS).create());
        grassGenerator.add("dampgrass", 1, (new GeneratorGrass.Builder()).with(BOPPlants.DAMPGRASS).create());
        grassGenerator.add("tallgrass", 1, (new GeneratorGrass.Builder()).with(BlockTallGrass.EnumType.GRASS).create());
        grassGenerator.add("doublegrass", 4, (new GeneratorDoubleFlora.Builder()).with(BlockDoublePlant.EnumPlantType.GRASS).create());
 
        // gem
        this.addGenerator("emerald", GeneratorStage.SAND, (new GeneratorOreSingle.Builder()).amountPerChunk(12).with(Blocks.EMERALD_ORE.getDefaultState()).create());
   
    }
    
    @Override
    public void applySettings(IBOPWorldSettings settings)
    {
        if (!settings.isEnabled(GeneratorType.PLANTS)) {this.removeGenerator("cattail"); this.removeGenerator("double_cattail"); this.removeGenerator("river_cane"); this.removeGenerator("tiny_cacti"); this.removeGenerator("roots"); this.removeGenerator("rafflesia"); this.removeGenerator("desert_sprouts");}
        
        GeneratorWeighted grassGen = (GeneratorWeighted)this.getGenerator("grass");
        if (!settings.isEnabled(GeneratorType.GRASSES)) {grassGen.removeGenerator("shortgrass"); grassGen.removeGenerator("mediumgrass"); grassGen.removeGenerator("wheatgrass"); grassGen.removeGenerator("dampgrass");}
    }
    
}