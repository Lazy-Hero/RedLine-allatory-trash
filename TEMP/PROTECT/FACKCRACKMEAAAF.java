/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.client.event.ClientChatEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import TEMP.PROTECT.FACKCRACKMEAAAr;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAF
extends FACKCRACKMEAAAH {
    public /* synthetic */ FACKCRACKMEAAAp Socketi;
    public /* synthetic */ FACKCRACKMEAAAr Socketk;
    public /* synthetic */ String Socketd;
    public /* synthetic */ FACKCRACKMEAAAr SocketC;
    public /* synthetic */ long Socketl;
    public /* synthetic */ FACKCRACKMEAAAr SocketH;
    public /* synthetic */ FACKCRACKMEAAAr Sockete;
    private /* synthetic */ String[] Socketa;
    public /* synthetic */ String SocketK;
    public /* synthetic */ int SocketG;
    public /* synthetic */ String SocketALLATORIxDEMOxURLConnection;

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection() {
        FACKCRACKMEAAAF a;
        a.SocketG = 0;
        a.Socketd = "";
        a.Socketl = System.currentTimeMillis();
        super.BufferedReaderALLATORIxDEMOxURLConnection();
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a3) {
        FACKCRACKMEAAAF a2;
        if (((Minecraft)a2.Sockete).field_71441_e != null && ((Minecraft)a2.Sockete).field_71441_e != null) {
            if (a2.Socketd.equals("")) {
                return;
            }
            int a3 = 0;
            if (a2.SocketC.BufferedReaderALLATORIxDEMOxURLConnection()) {
                ++a3;
            }
            if (a2.Socketk.BufferedReaderALLATORIxDEMOxURLConnection()) {
                ++a3;
            }
            if (a2.SocketH.BufferedReaderALLATORIxDEMOxURLConnection()) {
                ++a3;
            }
            if (a2.Socketk.BufferedReaderALLATORIxDEMOxURLConnection() && a3 == 1) {
                a2.SocketK = "/msg";
            }
            if (!a2.Socketk.BufferedReaderALLATORIxDEMOxURLConnection() && a2.SocketC.BufferedReaderALLATORIxDEMOxURLConnection() && !a2.SocketH.BufferedReaderALLATORIxDEMOxURLConnection()) {
                a2.SocketK = "/w";
            }
            if (!a2.Socketk.BufferedReaderALLATORIxDEMOxURLConnection() && !a2.SocketC.BufferedReaderALLATORIxDEMOxURLConnection() && a2.SocketH.BufferedReaderALLATORIxDEMOxURLConnection()) {
                a2.SocketK = "/tell";
            }
            if (a3 < 2) {
                // empty if block
            }
            return;
        }
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(ClientChatEvent a) {
        FACKCRACKMEAAAF a2;
        if (a2.Socketd.equals("")) {
            a2.Socketd = a.getMessage();
            a.setCanceled(true);
        }
    }

    public /* synthetic */ FACKCRACKMEAAAF() {
        super("PMspam", 0, FACKCRACKMEAAAT.Sockete);
        FACKCRACKMEAAAF a;
        a.Socketa = new String[]{"r", "e", "d", "l", "i", "n", "e", "k", "y", "p", "i"};
        a.Sockete = new FACKCRACKMEAAAr("Different endings", false);
        a.Socketi = new FACKCRACKMEAAAp("Delay", 50.0, 1.0, 6500.0);
        a.SocketC = new FACKCRACKMEAAAr("W", false);
        a.SocketH = new FACKCRACKMEAAAr("Tell", false);
        a.Socketk = new FACKCRACKMEAAAr("Msg", false);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketC);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketH);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Socketk);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Socketi);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Sockete);
    }
}

