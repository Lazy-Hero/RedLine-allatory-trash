/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAr;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class FACKCRACKMEAAAf
extends FACKCRACKMEAAAH {
    public /* synthetic */ FACKCRACKMEAAAr SocketALLATORIxDEMOxURLConnection;

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(RenderWorldLastEvent a) {
        FACKCRACKMEAAAf a2;
        if (a2.Sockete.field_71441_e != null && a2.Sockete.field_71439_g != null) {
            GlStateManager.func_179094_E();
            GL11.glClear((int)256);
            if (a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection()) {
                GL11.glBlendFunc((int)1, (int)1);
            }
            for (EntityPlayer entityPlayer : a2.Sockete.field_71441_e.field_73010_i) {
                if (entityPlayer == a2.Sockete.field_71439_g) continue;
                a2.Sockete.func_175598_ae().func_188388_a((Entity)entityPlayer, a.getPartialTicks(), false);
            }
            GlStateManager.func_179117_G();
            GlStateManager.func_179121_F();
        }
    }

    public /* synthetic */ FACKCRACKMEAAAf() {
        super("Chams", 0, FACKCRACKMEAAAT.SocketALLATORIxDEMOxURLConnection);
        FACKCRACKMEAAAf a;
        a.SocketALLATORIxDEMOxURLConnection = new FACKCRACKMEAAAr("???", false);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketALLATORIxDEMOxURLConnection);
    }
}

