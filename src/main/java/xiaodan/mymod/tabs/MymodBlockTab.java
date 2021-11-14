package xiaodan.mymod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xiaodan.mymod.init.ModBlocks;
import xiaodan.mymod.init.ModItems;

public class MymodBlockTab extends CreativeTabs
{
	public MymodBlockTab() 
	{
		super("mymodblock_tab");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(ModBlocks.WHITEJADE_BLOCK));
	}
}