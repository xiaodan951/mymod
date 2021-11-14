package xiaodan.mymod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xiaodan.mymod.init.ModRecipes;
import xiaodan.mymod.proxy.CommonProxy;
import xiaodan.mymod.tabs.MymodBlockTab;
import xiaodan.mymod.tabs.MymodItemTab;
import xiaodan.mymod.util.Reference;
import xiaodan.mymod.util.handlers.RegistryHandler;
import xiaodan.mymod.world.ModWorldGen;

@Mod( name = Reference.NAME, version=Reference.VERSION, modid = Reference.Mod_ID)  
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)//撒比
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(),3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs MYMODITEM_TAB = new MymodItemTab();
	public static CreativeTabs MYMODBLOCK_TAB = new MymodBlockTab();
}
