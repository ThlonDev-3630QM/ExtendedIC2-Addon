package shinano.yui.mod.extendedic2;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.IC2Items;
import ic2.core.Ic2Items;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "ExtendedIC2",name = "ExtendedIC2-Addon",version = "1.0")
public class ExtendedIC2 {
    public static boolean LoadedIC2 = false;
    public static Item capacitor;
    public static Item redstonecapacitor;
    public static Item lapotroncapacotor;
    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        LoadedIC2 = Loader.isModLoaded("IC2");
        capacitor = new capacitor();
        redstonecapacitor = new redstonecapacitor();
        lapotroncapacotor = new lapotroncapacitor();
        //galaxyGenerator = new galaxyGenerator();
        GameRegistry.registerItem(capacitor,"capacitor");
        GameRegistry.registerItem(redstonecapacitor,"redstonecapacitor");
        GameRegistry.registerItem(lapotroncapacotor,"lapotroncapacitor");
        //GameRegistry.registerBlock(galaxyGenerator,"galaxyGenerator");
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event){
        fixIC2Item.fixItem();
    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        GameRegistry.addRecipe(IC2Items.getItem("mixedMetalIngot"), new Object[]{"X", "Y", "Z", 'X', IC2Items.getItem("plateiron"), 'Y', IC2Items.getItem("platebronze"), 'Z', IC2Items.getItem("platetin")});
        GameRegistry.addRecipe(new ItemStack(Ic2Items.lapotronCrystal.getItem(),1,26), new Object[]{"RAR", "RER", "RAR", 'R', IC2Items.getItem("platelapi"), 'A', IC2Items.getItem("advancedCircuit"), 'E',new ItemStack(Ic2Items.energyCrystal.getItem(),1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(ExtendedIC2.capacitor), new Object[]{"GRG","GRG","C C",'G',IC2Items.getItem("plategold"),'R',Items.redstone,'C', IC2Items.getItem("insulatedTinCableItem")});
        GameRegistry.addRecipe(new ItemStack(ExtendedIC2.redstonecapacitor),new Object[]{"EEE","EEE","G G",'G',IC2Items.getItem("glassFiberCableItem"),'E',Ic2Items.energiumDust});
        GameRegistry.addRecipe(new ItemStack(ExtendedIC2.lapotroncapacotor),new Object[]{"LCL","LCL","G G",'L',Ic2Items.platelapi,'C',ExtendedIC2.redstonecapacitor,'G',Ic2Items.glassFiberCableItem});
        GameRegistry.addShapelessRecipe(new ItemStack(Ic2Items.energyCrystal.getItem(),1,26),new Object[]{ExtendedIC2.redstonecapacitor,Ic2Items.advancedCircuit,Ic2Items.advancedCircuit});
        GameRegistry.addShapelessRecipe(new ItemStack(Ic2Items.lapotronCrystal.getItem(),1,26),new Object[]{ExtendedIC2.lapotroncapacotor,Ic2Items.advancedCircuit,Ic2Items.advancedCircuit});
    }
}
