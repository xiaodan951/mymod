package xiaodan.mymod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xiaodan.mymod.init.ModItems;

public class MymodItemTab extends CreativeTabs
{
	public MymodItemTab() 
	{
		super("mymoditem_tab");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.WHITE_JADE);
	}
}
