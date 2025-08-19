package camoweed.rosesword;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static camoweed.rosesword.ModMain.LOGGER;
import static camoweed.rosesword.ModMain.MOD_ID;

import static camoweed.rosesword.ModItems.*;


// Same as the Models
// Please register the model entrypoint in fabric.mod.json:
// "recipesReady": [
// "deivethedev.tutorialmod.TutorialRecipes"
// ],

public class ModRecipes implements RecipeEntrypoint { // don't forget to implement the RecipeEntrypoint

	@Override
	public void onRecipesReady() { // Why the function name is onRecipesReady instead of initRecipes I don't know.

		// Registering a fuel
		LookupFuelFurnace.instance.addFuelEntry(roseSword.id, 12800);
		//						   				     Δ	       Δ
		//                                        item id    ticks per fuel (minecraft runs at 20 ticks per second and vanilla coal lasts 1600 ticks)


		// Crafting recipe

		// Like BlockBuilder
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"GRG",
				"DPD",
				" S ")
			.addInput('D', Items.DIAMOND) // you choose the letter and the input item (if you and vanilla/bta blocks use Blocks.COBBLESTONE)
            .addInput('S', Items.STICK)
            .addInput('G', Blocks.BLOCK_GOLD)
            .addInput('R', Blocks.FLOWER_RED)
            .addInput('P', Items.TOOL_SWORD_DIAMOND)
			.create("rose_sword", new ItemStack(roseSword, 1));
		//			      Δ                           Δ        Δ
		//			 recipe name               output item   quantity


		LOGGER.info("Recipes initialized.");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

}
