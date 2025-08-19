package camoweed.rosesword;


import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
//import net.minecraft.client.render.block.model.BlockModelStandard;
//import net.minecraft.client.render.block.model.BlockModelTorch;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.item.Item;
import net.minecraft.core.util.collection.NamespaceID;

import static camoweed.rosesword.ModMain.LOGGER;
import static camoweed.rosesword.ModMain.MOD_ID;

//import net.minecraft.core.util.helper.Side;
import org.jetbrains.annotations.NotNull;
import turniplabs.halplibe.util.ModelEntrypoint;
//import net.minecraft.client.render.block.model.BlockModelCrossedSquares;

// Importing blocks and items

//import static turniplabs.examplemod.ModItems.*;

public class ModModels implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		LOGGER.info("Block Models initialized.");
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

        	dispatcher.addDispatch(makeModel(ModItems.roseSword, "rosesword").setFull3D());

		LOGGER.info("Item Models initialized.");
	}
public static @NotNull ItemModelStandard makeModel(@NotNull final Item item, @NotNull final String textureValue) {
		return setIcon(new ItemModelStandard(item, null), NamespaceID.getTemp(MOD_ID, "item/" + textureValue));
	}

	public static <T extends ItemModelStandard> @NotNull T setIcon(@NotNull final T model, @NotNull final String texture) {
		model.icon = TextureRegistry.getTexture(texture);
		return model;
	}

	public static <T extends ItemModelStandard> @NotNull T setIcon(@NotNull final T model, @NotNull final NamespaceID texture) {
		model.icon = TextureRegistry.getTexture(texture);
		return model;
	}
	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {}
}
