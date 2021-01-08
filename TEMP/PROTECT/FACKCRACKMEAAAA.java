/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockAir
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import net.minecraft.block.BlockAir;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAA
extends FACKCRACKMEAAAH {
    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAA a2;
        if (a2.Sockete.field_71441_e != null && a2.Sockete.field_71439_g != null) {
            double d = a2.Sockete.field_71439_g.field_70165_t;
            double d2 = a2.Sockete.field_71439_g.field_70163_u;
            double d3 = a2.Sockete.field_71439_g.field_70161_v;
            if (a2.Sockete.field_71439_g.field_70122_E) {
                if (a2.Sockete.field_71441_e.func_180495_p(new BlockPos(d, d2 - 1.0, d3)).func_177230_c() instanceof BlockAir) {
                    KeyBinding.func_74510_a((int)a2.Sockete.field_71474_y.field_74311_E.func_151463_i(), (boolean)true);
                    return;
                }
                KeyBinding.func_74510_a((int)a2.Sockete.field_71474_y.field_74311_E.func_151463_i(), (boolean)false);
            }
        }
    }

    public /* synthetic */ FACKCRACKMEAAAA() {
        super("Eagle", 0, FACKCRACKMEAAAT.Socketa);
        FACKCRACKMEAAAA a;
    }
}

