package xiaodan.mymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class WhitejadeBlock extends BlockBase
{

    public WhitejadeBlock(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);

        setSoundType(SoundType.STONE);
        setHardness(60.0f);
        setResistance(5000.0f);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(15.0f);
        //setLightOpacity(1);
        //setBlockUnbreakable();


    }
}
