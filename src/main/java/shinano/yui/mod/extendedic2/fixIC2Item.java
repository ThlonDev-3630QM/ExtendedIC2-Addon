package shinano.yui.mod.extendedic2;

import ic2.core.Ic2Items;

public class fixIC2Item {
    public static void fixItem(){
        Ic2Items.lvTransformer.getItem().setMaxStackSize(64);
        Ic2Items.mvTransformer.getItem().setMaxStackSize(64);
        Ic2Items.hvTransformer.getItem().setMaxStackSize(64);
        Ic2Items.reBattery.getItem().setMaxStackSize(64);
        Ic2Items.chargingREBattery.getItem().setMaxStackSize(64);
        Ic2Items.energyCrystal.getItem().setMaxStackSize(64);
        Ic2Items.lapotronCrystal.getItem().setMaxStackSize(64);
        Ic2Items.reinforcedDoor.getItem().setMaxStackSize(64);
    }
}
