package net.fabricmc.modbojeu;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.modbojeu.items.BoJeuItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBojeu implements ModInitializer {
	public static final Item BOJEU_ITEM = new BoJeuItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM,new Identifier("modbojeu", "bojeu_item"),BOJEU_ITEM);
	}
}
