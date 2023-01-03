package shinano.yui.mod.extendedic2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class redstonecapacitor extends Item {
    public redstonecapacitor(){
        this.setCreativeTab(CreativeTabs.tabRedstone);
        this.setUnlocalizedName("redstonecapacitor");
        this.setMaxStackSize(64);
        this.setTextureName("extendedic2:redstone_capacitor");
    }
}
