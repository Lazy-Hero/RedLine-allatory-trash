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
import TEMP.PROTECT.FACKCRACKMEAAAp;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAJ
extends FACKCRACKMEAAAH {
    public /* synthetic */ FACKCRACKMEAAAp SocketG;
    public /* synthetic */ FACKCRACKMEAAAp SocketALLATORIxDEMOxURLConnection;

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAJ a2;
        if (a2.Sockete.field_71439_g != null && a2.Sockete.field_71441_e != null && a2.Sockete.field_71439_g.field_70737_aN != 0) {
            a2.Sockete.field_71439_g.field_70159_w *= a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection() / 100.0;
            a2.Sockete.field_71439_g.field_70181_x *= a2.SocketG.BufferedReaderALLATORIxDEMOxURLConnection() / 100.0;
            a2.Sockete.field_71439_g.field_70179_y *= a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection() / 100.0;
        }
    }

    public /* synthetic */ FACKCRACKMEAAAJ() {
        super("Velocity", 0, FACKCRACKMEAAAT.SocketK);
        FACKCRACKMEAAAJ a;
        a.SocketALLATORIxDEMOxURLConnection = new FACKCRACKMEAAAp("Horizontal", 50.0, 0.0, 100.0);
        a.SocketG = new FACKCRACKMEAAAp("Vertical", 50.0, 0.0, 100.0);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketALLATORIxDEMOxURLConnection);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketG);
    }
}

