package camoweed.rosesword;

import static camoweed.rosesword.ModMain.MOD_ID;

import net.minecraft.core.item.IArmorItem;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolSword;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;

public class ModItems {
    private static int startingID = ModConfig.CFG.getInt("IDs.startingBlockID");
    private static int nextID() {return startingID++;}

    public static Item roseSword;
    public static Item roseBoots;
    public static Item rosePants;
    public static Item roseChest;
    public static Item roseHelm;
        public static ToolMaterial roseToolMaterial = new ToolMaterial().setDurability(2303).setEfficiency(7.0f, 45.0f).setMiningLevel(3).setDamage(3);
        public static ArmorMaterial roseArmour = ArmorHelper.createArmorMaterial(MOD_ID, "roseArmour", 600, 50f, 35f, 15f, 100f);
    public static void initItems() {
            roseSword = new ItemBuilder(MOD_ID)
        .build(new ItemToolSword("item.rosesword", MOD_ID + ":item/rosesword", nextID(), roseToolMaterial));
            roseBoots = new ItemBuilder(MOD_ID)
        .build(new ItemArmor("item.roseBoots", MOD_ID + ":item/roseBoots", nextID(), roseArmour, IArmorItem.PIECE_BOOTS));
            rosePants = new ItemBuilder(MOD_ID)
        .build(new ItemArmor("item.rosePants", MOD_ID + ":item/rosePants", nextID(), roseArmour, IArmorItem.PIECE_LEGS));
            roseChest = new ItemBuilder(MOD_ID)
        .build(new ItemArmor("item.roseChest", MOD_ID + ":item/roseChest", nextID(), roseArmour, IArmorItem.PIECE_CHEST));
            roseHelm = new ItemBuilder(MOD_ID)
        .build(new ItemArmor("item.roseHelm", MOD_ID + ":item/roseHelm", nextID(), roseArmour, IArmorItem.PIECE_HEAD));
    }
}
