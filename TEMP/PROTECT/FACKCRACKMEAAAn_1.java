/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import TEMP.PROTECT.FACKCRACKMEAAAv;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAn
extends FACKCRACKMEAAAH {
    private /* synthetic */ String[] SocketK;
    public /* synthetic */ FACKCRACKMEAAAv SocketG;
    public /* synthetic */ FACKCRACKMEAAAp SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ FACKCRACKMEAAAn() {
        super("Hitbox", 0, FACKCRACKMEAAAT.SocketK);
        FACKCRACKMEAAAn a;
        a.SocketALLATORIxDEMOxURLConnection = new FACKCRACKMEAAAp("Expand", 0.5, 0.1, 5.0);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketALLATORIxDEMOxURLConnection);
        a.SocketK = new String[]{"test#1", "test#2"};
        a.SocketG = new FACKCRACKMEAAAv(a.SocketK, "test#1");
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketG);
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAn a2;
        if (a2.Sockete.field_71439_g != null && a2.Sockete.field_71439_g != null) {
            for (EntityPlayer entityPlayer : a2.Sockete.field_71441_e.field_73010_i) {
                if (entityPlayer == a2.Sockete.field_71439_g) continue;
                entityPlayer.field_70130_N = 0.6f;
                entityPlayer.field_70131_O = 1.8f;
                double d = ((double)((float)a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection()) + 0.6) / 2.0;
                entityPlayer.func_174826_a(new AxisAlignedBB(entityPlayer.field_70165_t - d, entityPlayer.field_70163_u, entityPlayer.field_70161_v - d, entityPlayer.field_70165_t + d, entityPlayer.field_70163_u + (double)entityPlayer.field_70131_O, entityPlayer.field_70161_v + d));
            }
        }
    }
}

