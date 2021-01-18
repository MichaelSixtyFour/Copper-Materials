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

	//Register ItemGroup
	public final ItemGroup coppermaterials_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(this.COPPER_AXE));

	//Register Tools
	public final ToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 0F, -3.0F, new Item.Settings().group(coppermaterials_GROUP));
	public final ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 1, -2.4F, new Item.Settings().group(coppermaterials_GROUP));
	public final ToolItem COPPER_PICKAXE = new CopperPickaxeItem(CopperToolMaterial.INSTANCE, 0, -2.8F, new Item.Settings().group(coppermaterials_GROUP));
	public final ToolItem COPPER_AXE = new CopperAxeItem(CopperToolMaterial.INSTANCE, 4, -2.8F, new Item.Settings().group(coppermaterials_GROUP));
	public final ToolItem COPPER_HOE = new CopperHoeItem(CopperToolMaterial.INSTANCE, -3, -1.0F, new Item.Settings().group(coppermaterials_GROUP));

	//Register Armor
	public final Item COPPER_MATERIAL_HELMET = new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(coppermaterials_GROUP));
	public final Item COPPER_MATERIAL_CHESTPLATE = new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(coppermaterials_GROUP));
	public final Item COPPER_MATERIAL_LEGGINGS = new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(coppermaterials_GROUP));
	public final Item COPPER_MATERIAL_BOOTS = new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(coppermaterials_GROUP));


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

	}
}
