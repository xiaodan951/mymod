package xiaodan.mymod.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import xiaodan.mymod.Main;
import xiaodan.mymod.init.ModItems;
import xiaodan.mymod.util.IHasModel;

public class ToolAxe extends ItemAxe implements IHasModel 
{
public ToolAxe(String name, CreativeTabs tab, ToolMaterial material) {
		
		super(material, 11.0f, -3.0f);
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
