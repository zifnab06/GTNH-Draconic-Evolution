package com.brandon3055.draconicevolution.common.utills;

import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Brandon on 29/12/2014.
 */
public interface IConfigurableItem {
//todo
//	String[] getNames(ItemStack stack);
//
//	int getDataType(String name);

	List<ItemConfigValue> getFields(ItemStack stack, int slot);
}
