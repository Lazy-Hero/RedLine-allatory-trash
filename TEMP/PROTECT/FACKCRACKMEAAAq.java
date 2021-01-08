/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAq
extends FACKCRACKMEAAAH {
    public /* synthetic */ FACKCRACKMEAAAq() {
        super("Triggerbot", 0, FACKCRACKMEAAAT.SocketK);
        FACKCRACKMEAAAq a;
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAq a2;
        if (a2.Sockete.field_71441_e != null && a2.Sockete.field_71439_g != null && (a = a2.Sockete.field_147125_j) != null && a instanceof EntityPlayer && a2.Sockete.field_71439_g.func_184825_o(0.0f) == 1.0f) {
            a2.Sockete.field_71439_g.field_71174_a.func_147297_a((Packet)new CPacketUseEntity((Entity)a));
            a2.Sockete.field_71439_g.func_184821_cY();
            a2.Sockete.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
        }
    }
}

