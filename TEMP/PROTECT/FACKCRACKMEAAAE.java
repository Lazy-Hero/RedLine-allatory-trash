/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAf;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import TEMP.PROTECT.FACKCRACKMEAAAr;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FACKCRACKMEAAAE
extends FACKCRACKMEAAAH {
    private /* synthetic */ FACKCRACKMEAAAp Sockete;
    private /* synthetic */ FACKCRACKMEAAAr Socketa;
    private /* synthetic */ FACKCRACKMEAAAp SocketK;
    private /* synthetic */ FACKCRACKMEAAAp SocketG;
    private /* synthetic */ FACKCRACKMEAAAp SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ FACKCRACKMEAAAE() {
        super("ESP", 0, FACKCRACKMEAAAT.SocketALLATORIxDEMOxURLConnection);
        FACKCRACKMEAAAE a;
        a.Sockete = new FACKCRACKMEAAAp("Red", 255.0, 1.0, 255.0);
        a.SocketK = new FACKCRACKMEAAAp("Green", 255.0, 1.0, 255.0);
        a.SocketALLATORIxDEMOxURLConnection = new FACKCRACKMEAAAp("Blue", 255.0, 1.0, 255.0);
        a.SocketG = new FACKCRACKMEAAAp("Opacity", 255.0, 1.0, 255.0);
        a.Socketa = new FACKCRACKMEAAAr("Rainbow", false);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Socketa);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Sockete);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketK);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketALLATORIxDEMOxURLConnection);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketG);
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(RenderWorldLastEvent a) {
        FACKCRACKMEAAAE a2;
        if (((Minecraft)a2.Sockete).field_71439_g != null && ((Minecraft)a2.Sockete).field_71441_e != null) {
            for (EntityPlayer entityPlayer : a2.Sockete.field_71441_e.field_73010_i) {
                a2.Sockete.func_175598_ae();
                RenderManager renderManager = a2.Sockete.func_175598_ae();
                double d = renderManager.field_78730_l;
                double d2 = renderManager.field_78731_m;
                double d3 = renderManager.field_78728_n;
                d = entityPlayer.field_70142_S + (entityPlayer.field_70165_t - entityPlayer.field_70142_S) * (double)a.getPartialTicks() - d;
                d2 = entityPlayer.field_70137_T + (entityPlayer.field_70163_u - entityPlayer.field_70137_T) * (double)a.getPartialTicks() - d2;
                d3 = entityPlayer.field_70136_U + (entityPlayer.field_70161_v - entityPlayer.field_70136_U) * (double)a.getPartialTicks() - d3;
                if (!(!a2.Socketa.BufferedReaderALLATORIxDEMOxURLConnection() ? entityPlayer != ((Minecraft)a2.Sockete).field_71439_g : entityPlayer != ((Minecraft)a2.Sockete).field_71439_g)) continue;
            }
        }
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection() {
        FACKCRACKMEAAAE a;
        FACKCRACKMEAAAf fACKCRACKMEAAAf = (FACKCRACKMEAAAf)FACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection(FACKCRACKMEAAAf.class);
        if (fACKCRACKMEAAAf.BufferedReaderALLATORIxDEMOxURLConnection()) {
            fACKCRACKMEAAAf.BufferedReaderALLATORIxDEMOxURLConnection(false);
            fACKCRACKMEAAAf.BufferedReaderALLATORIxDEMOxURLConnection(true);
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection();
    }
}

