package shinano.yui.mod.extendedic2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class lapotroncapacitor extends Item {
    public lapotroncapacitor(){
        this.setCreativeTab(CreativeTabs.tabRedstone);
        this.setUnlocalizedName("lapotroncapacitor");
        this.setMaxStackSize(64);
        this.setTextureName("extendedic2:lapotron_capacitor");
    }
}
