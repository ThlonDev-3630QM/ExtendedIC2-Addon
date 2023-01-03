package shinano.yui.mod.extendedic2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class capacitor extends Item {
    public capacitor(){
        this.setCreativeTab(CreativeTabs.tabRedstone);
        this.setUnlocalizedName("capacitor");
        this.setMaxStackSize(64);
        this.setTextureName("extendedic2:capacitor");
    }
}
