package dev.michaelsixtyfour.coppermaterials;

import dev.michaelsixtyfour.coppermaterials.tool.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CopperMaterials implements ModInitializer {

	public static final String MOD_ID = "coppermaterials";
	public static final String MOD_NAME = "Copper Materials";

	public static final ToolMaterial COPPER_TOOL_MATERIAL = new CopperToolMaterial();
	public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();

	//Register ItemGroup
	public final ItemGroup coppermaterials_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(this.COPPER_AXE));

	//Register Tools
	public final ToolItem COPPER_SHOVEL = new ShovelItem(COPPER_TOOL_MATERIAL, 0F, -3.0F, new Item.Settings().group(coppermaterials_GROUP));
	public final ToolItem COPPER_SWORD = new SwordItem(COPPER_TOOL_MATERIAL, 1, -2.4F, new Item.Settings().group(coppermaterials_GROUP));
	public final ToolItem COPPER_PICKAXE = new CopperPickaxeItem(COPPER_TOOL_MATERIAL, 0, -2.8F, new Item.Settings().group(coppermaterials_GROUP));
	public final ToolItem COPPER_AXE = new CopperAxeItem(COPPER_TOOL_MATERIAL, 4, -2.8F, new Item.Settings().group(coppermaterials_GROUP));
	public final ToolItem COPPER_HOE = new CopperHoeItem(COPPER_TOOL_MATERIAL, -3, -1.0F, new Item.Settings().group(coppermaterials_GROUP));

	//Register Armor
	public final Item COPPER_MATERIAL_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(coppermaterials_GROUP));
	public final Item COPPER_MATERIAL_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(coppermaterials_GROUP));
	public final Item COPPER_MATERIAL_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(coppermaterials_GROUP));
	public final Item COPPER_MATERIAL_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(coppermaterials_GROUP));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_shovel"), COPPER_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_sword"), COPPER_SWORD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_pickaxe"), COPPER_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_axe"), COPPER_AXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_hoe"), COPPER_HOE);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_helmet"), COPPER_MATERIAL_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_chestplate"), COPPER_MATERIAL_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_leggings"), COPPER_MATERIAL_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_boots"), COPPER_MATERIAL_BOOTS);

	}
}
