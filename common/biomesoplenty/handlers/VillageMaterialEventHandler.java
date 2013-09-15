package biomesoplenty.handlers;

import net.minecraft.block.Block;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.terraingen.BiomeEvent;
import biomesoplenty.api.Biomes;
import biomesoplenty.api.Blocks;

public class VillageMaterialEventHandler
{
	@ForgeSubscribe
	public void getVillageBlockID(BiomeEvent.GetVillageBlockID event)
	{
		//Arctic
		if (event.biome == Biomes.arctic.get())
		{
			//Cobblestone
			if (event.original == Block.cobblestone.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Logs
			if (event.original == Block.wood.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Wooden Planks
			if (event.original == Block.planks.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Wooden Stairs
			if (event.original == Block.stairsWoodOak.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Cobblestone Stairs
			if (event.original == Block.stairsCobblestone.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Single Stone Slabs
			if (event.original == Block.stoneSingleSlab.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Glass Panes
			if (event.original == Block.thinGlass.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Iron Bars
			if (event.original == Block.fenceIron.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Fences
			if (event.original == Block.fence.blockID)
			{
				event.replacement = Block.cobblestoneWall.blockID;
				event.setResult(Result.DENY);
			}
			
			//Double Stone Slabs
			if (event.original == Block.stoneDoubleSlab.blockID)
			{
				event.replacement = Block.blockSnow.blockID;
				event.setResult(Result.DENY);
			}
			
			//Lava
			if (event.original == Block.lavaStill.blockID)
			{
				event.replacement = Block.ice.blockID;
				event.setResult(Result.DENY);
			}
			if (event.original == Block.lavaMoving.blockID)
			{
				event.replacement = Block.ice.blockID;
				event.setResult(Result.DENY);
			}
			
			//Water
			if (event.original == Block.waterStill.blockID)
			{
				event.replacement = Block.ice.blockID;
				event.setResult(Result.DENY);
			}
			if (event.original == Block.waterMoving.blockID)
			{
				event.replacement = Block.ice.blockID;
				event.setResult(Result.DENY);
			}
			
			//Crops
			if (event.original == Block.crops.blockID)
			{
				event.replacement = 0;
				event.setResult(Result.DENY);
			}
			if (event.original == Block.potato.blockID)
			{
				event.replacement = 0;
				event.setResult(Result.DENY);
			}
			if (event.original == Block.carrot.blockID)
			{
				event.replacement = 0;
				event.setResult(Result.DENY);
			}
			
			//Farmland
			if (event.original == Block.tilledField.blockID)
			{
				event.replacement = Block.dirt.blockID;
				event.setResult(Result.DENY);
			}
			
			//Pressure Plate
			if (event.original == Block.pressurePlatePlanks.blockID)
			{
				event.replacement = 0;
				event.setResult(Result.DENY);
			}
		}
		
		//Savanna
		if (event.biome == Biomes.savanna.get())
		{
			//Cobblestone
			if (event.original == Block.cobblestone.blockID)
			{
				event.replacement = Blocks.logs1.get().blockID;
				event.setResult(Result.DENY);
			}
			
			//Logs
			if (event.original == Block.wood.blockID)
			{
				event.replacement = Blocks.logs1.get().blockID;
				event.setResult(Result.DENY);
			}
			
			//Wooden Planks
			if (event.original == Block.planks.blockID)
			{
				event.replacement = Blocks.planks.get().blockID;
				event.setResult(Result.DENY);
			}
			
			//Wooden Stairs
			if (event.original == Block.stairsWoodOak.blockID)
			{
				event.replacement = Blocks.acaciaStairs.get().blockID;
				event.setResult(Result.DENY);
			}
			
			//Cobblestone Stairs
			if (event.original == Block.stairsCobblestone.blockID)
			{
				event.replacement = Blocks.acaciaStairs.get().blockID;
				event.setResult(Result.DENY);
			}
			
			//Stone Slabs
			if (event.original == Block.stoneSingleSlab.blockID)
			{
				event.replacement = Blocks.woodenSingleSlab1.get().blockID;
				event.setResult(Result.DENY);
			}
			
			//Lava
			if (event.original == Block.lavaStill.blockID)
			{
				event.replacement = Block.waterStill.blockID;
				event.setResult(Result.DENY);
			}
			if (event.original == Block.lavaMoving.blockID)
			{
				event.replacement = Block.waterMoving.blockID;
				event.setResult(Result.DENY);
			}
			
			//Gravel
			if (event.original == Block.gravel.blockID)
			{
				event.replacement = Block.sand.blockID;
				event.setResult(Result.DENY);
			}
		}
	}
}