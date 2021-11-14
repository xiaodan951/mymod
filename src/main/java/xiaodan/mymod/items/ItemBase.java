package xiaodan.mymod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xiaodan.mymod.Main;
import xiaodan.mymod.init.ModItems;
import xiaodan.mymod.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	
	public ItemBase(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
