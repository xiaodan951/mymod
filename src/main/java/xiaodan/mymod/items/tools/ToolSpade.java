package xiaodan.mymod.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import xiaodan.mymod.Main;
import xiaodan.mymod.init.ModItems;
import xiaodan.mymod.util.IHasModel;

public class ToolSpade extends ItemSpade implements IHasModel
{
public ToolSpade(String name, CreativeTabs tab, ToolMaterial material) {
		
		super(material);
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
