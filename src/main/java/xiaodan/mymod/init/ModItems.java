package xiaodan.mymod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import xiaodan.mymod.Main;
import xiaodan.mymod.items.ItemBase;
import xiaodan.mymod.items.tools.ToolAxe;
import xiaodan.mymod.items.tools.ToolHoe;
import xiaodan.mymod.items.tools.ToolPickaxe;
import xiaodan.mymod.items.tools.ToolSpade;
import xiaodan.mymod.items.tools.ToolSword;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Material
	public static final ToolMaterial MATERIAL_WHITEJADE = EnumHelper.addToolMaterial("material_whitejade", 3, -1, 10.0f, 5.0f, 12);
	
	
	//Items	
	public static final Item WHITE_JADE = new ItemBase("white_jade", Main.MYMODITEM_TAB);
	
	
	//Tools
	public static final ItemSword WHITEJADE_SWORD = new ToolSword("whitejade_sword", Main.MYMODITEM_TAB, MATERIAL_WHITEJADE);
	public static final ItemAxe WHITEJADE_AXE = new ToolAxe("whitejade_axe", Main.MYMODITEM_TAB, MATERIAL_WHITEJADE);
	public static final ItemSpade WHITEJADE_SPADE = new ToolSpade("whitejade_shove",Main.MYMODITEM_TAB,MATERIAL_WHITEJADE);
	public static final ItemPickaxe WHITEJADE_PICKAXE = new ToolPickaxe("whitejade_pickaxe", Main.MYMODITEM_TAB, MATERIAL_WHITEJADE);
	public static final ItemHoe WHITEJADE_HOE = new ToolHoe("whitejade_hoe", Main.MYMODITEM_TAB, MATERIAL_WHITEJADE);
	
	
	
	
	
	
	
	
	
}
