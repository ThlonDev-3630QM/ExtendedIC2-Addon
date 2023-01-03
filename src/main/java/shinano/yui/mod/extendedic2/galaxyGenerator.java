package shinano.yui.mod.extendedic2;

import ic2.api.item.IC2Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class galaxyGenerator extends Block {
    public galaxyGenerator(){
        super(Material.iron);
        setHardness(3.0F);
        setStepSound(soundTypeMetal);
    }
    public Item getItemDropped(int i, Random random, int j) {
        return IC2Items.getItem("machine").getItem();
    }
    public int quantityDropped(Random random) {
        return 1;
    }

}
