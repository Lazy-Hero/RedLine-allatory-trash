/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAj
extends FACKCRACKMEAAAH {
    @Override
    public /* synthetic */ void BufferedReaderj() {
        FACKCRACKMEAAAj a;
        a.Sockete.field_71439_g.field_70144_Y = 0.0f;
        super.BufferedReaderj();
    }

    public /* synthetic */ FACKCRACKMEAAAj() {
        super("NoPush", 0, FACKCRACKMEAAAT.Sockete);
        FACKCRACKMEAAAj a;
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.RenderTickEvent a) {
        FACKCRACKMEAAAj a2;
        if (a2.Sockete.field_71439_g != null && a2.Sockete.field_71441_e != null) {
            a2.Sockete.field_71439_g.field_70144_Y = 1.0f;
        }
    }
}

