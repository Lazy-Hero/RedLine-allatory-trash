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

public class FACKCRACKMEAAAi
extends FACKCRACKMEAAAH {
    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection() {
        FACKCRACKMEAAAi a;
        a.Sockete.field_71439_g.field_70181_x += (double)0.2f;
        super.BufferedReaderALLATORIxDEMOxURLConnection();
    }

    public /* synthetic */ FACKCRACKMEAAAi() {
        super("Fly", 0, FACKCRACKMEAAAT.SocketG);
        FACKCRACKMEAAAi a;
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAi a2;
        if (a2.Sockete.field_71439_g != null && a2.Sockete.field_71441_e != null) {
            a2.Sockete.field_71439_g.field_71075_bZ.field_75100_b = true;
        }
    }

    @Override
    public /* synthetic */ void BufferedReaderj() {
        FACKCRACKMEAAAi a;
        a.Sockete.field_71439_g.field_71075_bZ.field_75100_b = false;
        super.BufferedReaderj();
    }
}

