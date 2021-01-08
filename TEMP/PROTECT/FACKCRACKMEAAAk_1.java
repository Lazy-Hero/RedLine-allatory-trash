/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAk
extends FACKCRACKMEAAAH {
    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAk a2;
        if (a2.Sockete.field_71441_e != null && a2.Sockete.field_71441_e != null) {
            if (a2.Sockete.field_71439_g.field_70123_F) {
                return;
            }
            if (a2.Sockete.field_71439_g.field_191988_bg > 0.0f) {
                a2.Sockete.field_71439_g.func_70031_b(true);
                return;
            }
            a2.Sockete.field_71439_g.func_70031_b(false);
        }
    }

    @Override
    public /* synthetic */ void BufferedReaderj() {
        FACKCRACKMEAAAk a;
        a.Sockete.field_71439_g.func_70031_b(false);
        super.BufferedReaderj();
    }

    public /* synthetic */ FACKCRACKMEAAAk() {
        super("AutoSprint", 19, FACKCRACKMEAAAT.SocketG);
        FACKCRACKMEAAAk a;
    }
}

