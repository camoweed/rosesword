package camoweed.rosesword;

import static camoweed.rosesword.ModMain.MOD_ID;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolSword;
import turniplabs.halplibe.helper.ItemBuilder;

public class ModItems {
    public static Item roseSword;
        public static ToolMaterial roseToolMaterial = new ToolMaterial().setDurability(4608).setEfficiency(7.0f, 45.0f).setMiningLevel(3).setDamage(4);

    public static void initItems() {
        roseSword = new ItemBuilder(MOD_ID)
        .build(new ItemToolSword("item.rosesword", MOD_ID + ":item/rosesword", 17000, roseToolMaterial));
    }
}
