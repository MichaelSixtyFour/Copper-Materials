package dev.michaelsixtyfour.coppermaterials;

import dev.michaelsixtyfour.coppermaterials.tool.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class coppermaterials implements ModInitializer {

	public static final String MOD_ID = "coppermaterials";
	public static final String MOD_NAME = "coppermaterials";

	//Register Tools
	public static ToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem COPPER_PICKAXE = new CopperPickaxeItem(CopperToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem COPPER_AXE = new CopperAxeItem(CopperToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem COPPER_HOE = new CopperHoeItem(CopperToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));

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
