package xiaodan.mymod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModItems.WHITE_JADE, new ItemStack(Items.DIAMOND,1), 0.7f);
		GameRegistry.addSmelting(ModBlocks.WHITEJADE_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCK,1), 0.7f);
	}
}
