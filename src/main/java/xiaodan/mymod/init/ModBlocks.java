package xiaodan.mymod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import xiaodan.mymod.Main;
import xiaodan.mymod.blocks.BlockBase;
import xiaodan.mymod.blocks.WhitejadeBlock;
import xiaodan.mymod.blocks.WhitejadeOre;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block WHITEJADE_BLOCK = new WhitejadeBlock("whitejade_block",Material.IRON, Main.MYMODBLOCK_TAB);
	public static final Block WHITEJADE_ORE = new WhitejadeOre("whitejade_ore",Material.ROCK,Main.MYMODBLOCK_TAB);
}
