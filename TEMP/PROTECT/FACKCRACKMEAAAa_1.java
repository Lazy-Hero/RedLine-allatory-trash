/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ClickType
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAa
extends FACKCRACKMEAAAH {
    public /* synthetic */ int SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ int BufferedReaderj() {
        for (int i = 0; i < 45; ++i) {
            FACKCRACKMEAAAa a;
            if (a.Sockete.field_71439_g.field_71069_bz.func_75139_a(i).func_75211_c().func_77973_b() != Items.field_190929_cY) continue;
            return i;
        }
        return 50;
    }

    public /* synthetic */ FACKCRACKMEAAAa() {
        super("AutoTotem", 0, FACKCRACKMEAAAT.Socketa);
        FACKCRACKMEAAAa a;
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAa a2;
        if (a2.Sockete.field_71439_g != null && a2.Sockete.field_71441_e != null && a2.Sockete.field_71439_g.func_184592_cb().func_77973_b() != Items.field_190929_cY) {
            if (a2.BufferedReaderj() == 50) {
                return;
            }
            a2.SocketALLATORIxDEMOxURLConnection = a2.BufferedReaderj();
            a2.Sockete.field_71442_b.func_187098_a(0, a2.BufferedReaderj(), 0, ClickType.PICKUP, (EntityPlayer)a2.Sockete.field_71439_g);
            a2.Sockete.field_71442_b.func_187098_a(0, 45, 0, ClickType.PICKUP, (EntityPlayer)a2.Sockete.field_71439_g);
            a2.Sockete.field_71442_b.func_187098_a(0, a2.SocketALLATORIxDEMOxURLConnection, 0, ClickType.PICKUP, (EntityPlayer)a2.Sockete.field_71439_g);
        }
    }
}

