/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  org.lwjgl.input.Keyboard
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class FACKCRACKMEAAAm
extends FACKCRACKMEAAAH {
    public /* synthetic */ FACKCRACKMEAAAp SocketALLATORIxDEMOxURLConnection;

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAm a2;
        if (a2.Sockete.field_71441_e != null && a2.Sockete.field_71439_g != null) {
            if (Keyboard.isKeyDown((int)205)) {
                a2.Sockete.field_71439_g.field_70177_z = (float)((double)a2.Sockete.field_71439_g.field_70177_z + a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection());
            }
            if (Keyboard.isKeyDown((int)203)) {
                a2.Sockete.field_71439_g.field_70177_z = (float)((double)a2.Sockete.field_71439_g.field_70177_z - a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection());
            }
            if (Keyboard.isKeyDown((int)200)) {
                a2.Sockete.field_71439_g.field_70125_A = (float)((double)a2.Sockete.field_71439_g.field_70125_A - a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection());
            }
            if (Keyboard.isKeyDown((int)208)) {
                a2.Sockete.field_71439_g.field_70125_A = (float)((double)a2.Sockete.field_71439_g.field_70125_A + a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection());
            }
            if (Keyboard.isKeyDown((int)28) && a2.Sockete.field_147125_j != null) {
                a2.Sockete.field_71439_g.field_71174_a.func_147297_a((Packet)new CPacketUseEntity(a2.Sockete.field_147125_j));
                a2.Sockete.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
                a2.Sockete.field_71439_g.func_184821_cY();
            }
        }
    }

    public /* synthetic */ FACKCRACKMEAAAm() {
        super("Controls", 0, FACKCRACKMEAAAT.SocketALLATORIxDEMOxURLConnection);
        FACKCRACKMEAAAm a;
        a.SocketALLATORIxDEMOxURLConnection = new FACKCRACKMEAAAp("Speed", 1.0, 1.0, 15.0);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketALLATORIxDEMOxURLConnection);
    }
}

