/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAh;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import TEMP.PROTECT.FACKCRACKMEAAAr;
import TEMP.PROTECT.FACKCRACKMEAAAy;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class FACKCRACKMEAAAG
extends FACKCRACKMEAAAH {
    public /* synthetic */ FACKCRACKMEAAAp SocketH;
    public /* synthetic */ FACKCRACKMEAAAr Sockete;
    public /* synthetic */ FACKCRACKMEAAAp Socketa;
    public /* synthetic */ FACKCRACKMEAAAp SocketK;
    public /* synthetic */ FACKCRACKMEAAAp SocketG;
    public /* synthetic */ FACKCRACKMEAAAh SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, String a3, int a4, float a5) {
        for (int i = 0; i < a3.length(); ++i) {
            FACKCRACKMEAAAG a6;
            String string = a3.charAt(i) + "";
            if (a3.equalsIgnoreCase("redline")) {
                Minecraft.func_71410_x().field_71466_p.func_78276_b(string, a, a2, a6.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection((long)i * 3500000L, a5, a4).getRGB());
            } else if (!a6.Sockete.BufferedReaderALLATORIxDEMOxURLConnection()) {
                Minecraft.func_71410_x().field_71466_p.func_78276_b(string, a, a2, new Color((int)a6.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(), (int)a6.Socketa.BufferedReaderALLATORIxDEMOxURLConnection(), (int)a6.SocketK.BufferedReaderALLATORIxDEMOxURLConnection(), 255).getRGB());
            } else {
                Minecraft.func_71410_x().field_71466_p.func_78276_b(string, a, a2, a6.SocketALLATORIxDEMOxURLConnection.BufferedReaderj((long)i * 3500000L, a5, a4).getRGB());
            }
            a += Minecraft.func_71410_x().field_71466_p.func_78263_a(a3.charAt(i));
        }
    }

    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(ResourceLocation a, float a2, float a3, float a4, float a5) {
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)255.0f);
        float f = (a4 + a5) / 2.0f;
        int n = Math.round(f);
        Minecraft.func_71410_x().func_110434_K().func_110577_a(a);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)a2, (double)a3);
        GL11.glTexCoord2d((double)0.0, (double)(f / (float)n));
        GL11.glVertex2d((double)a2, (double)(a3 + a5));
        GL11.glTexCoord2d((double)1.0, (double)(f / (float)n));
        GL11.glVertex2d((double)(a2 + a4), (double)(a3 + a5));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)(a2 + a4), (double)a3);
        GL11.glEnd();
    }

    public /* synthetic */ FACKCRACKMEAAAG() {
        super("Hud", 0, FACKCRACKMEAAAT.SocketALLATORIxDEMOxURLConnection);
        FACKCRACKMEAAAG a;
        a.SocketALLATORIxDEMOxURLConnection = new FACKCRACKMEAAAh();
        a.SocketG = new FACKCRACKMEAAAp("Red", 255.0, 0.0, 255.0);
        a.Socketa = new FACKCRACKMEAAAp("Green", 255.0, 0.0, 255.0);
        a.SocketK = new FACKCRACKMEAAAp("Blue", 255.0, 0.0, 255.0);
        a.SocketH = new FACKCRACKMEAAAp("Speed", 1.0, 0.0, 100.0);
        a.Sockete = new FACKCRACKMEAAAr("Rainbow", false);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketG);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Socketa);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketK);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketH);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Sockete);
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(RenderGameOverlayEvent.Text a3) {
        FACKCRACKMEAAAG a2;
        if (((Minecraft)a2.Sockete).field_71439_g != null && ((Minecraft)a2.Sockete).field_71441_e != null) {
            GlStateManager.func_179094_E();
            GlStateManager.func_179139_a((double)2.5, (double)2.5, (double)2.5);
            RenderHelper.func_74518_a();
            a3 = "Blue Mouse";
            GlStateManager.func_179144_i((int)FACKCRACKMEAAAy.BufferedReaderALLATORIxDEMOxURLConnection().Socketa.func_110552_b());
            ((Minecraft)a2.Sockete).field_71456_v.func_73729_b(1, 1, 0, 0, (int)((float)((Minecraft)a2.Sockete).field_71466_p.func_78256_a((String)a3) + 2.5f), a2.Sockete.field_71466_p.field_78288_b);
            a2.BufferedReaderALLATORIxDEMOxURLConnection(3, 2, (String)a3, 200, 0.5f);
            RenderHelper.func_74519_b();
            RenderHelper.func_74520_c();
            GlStateManager.func_179121_F();
            GlStateManager.func_179094_E();
            int a3 = 0;
            GlStateManager.func_179139_a((double)1.2, (double)1.2, (double)1.2);
            RenderHelper.func_74519_b();
            for (FACKCRACKMEAAAH fACKCRACKMEAAAH : FACKCRACKMEAAAy.Socketa.BufferedReaderALLATORIxDEMOxURLConnection()) {
                RenderHelper.func_74518_a();
                if (!fACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection() || fACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection().equalsIgnoreCase("hud")) continue;
                a2.BufferedReaderALLATORIxDEMOxURLConnection(2, a2.Sockete.field_71466_p.field_78288_b + 14 + a3, fACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection(), (int)(a2.SocketH.BufferedReaderALLATORIxDEMOxURLConnection() * 10.0), 0.7f);
                a3 += a2.Sockete.field_71466_p.field_78288_b + 1;
            }
            RenderHelper.func_74518_a();
            GlStateManager.func_179117_G();
            GlStateManager.func_179121_F();
        }
    }
}

