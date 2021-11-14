package xiaodan.mymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xiaodan.mymod.init.ModItems;

import java.util.Random;

public class WhitejadeOre extends BlockBase
{

    public WhitejadeOre(String name, Material material, CreativeTabs tab)
    {
        super(name, material, tab);

        setSoundType(SoundType.STONE);
        setHardness(50.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 3);

    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return ModItems.WHITE_JADE;
    }

    @Override
    public int quantityDropped(Random random)
    {
        int min=1;
        int max=4;
        return random.nextInt(max)+min;
    }
}
