/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAW;
import TEMP.PROTECT.FACKCRACKMEAAAX;
import TEMP.PROTECT.FACKCRACKMEAAAb;
import TEMP.PROTECT.FACKCRACKMEAAAu;
import TEMP.PROTECT.FACKCRACKMEAAAy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class FACKCRACKMEAAAt
extends FACKCRACKMEAAAX {
    public /* synthetic */ boolean Socketf;
    public /* synthetic */ FACKCRACKMEAAAT Socketc;
    public /* synthetic */ boolean SocketB;
    public /* synthetic */ FACKCRACKMEAAAb Socketb;
    public /* synthetic */ boolean Socketi;
    public /* synthetic */ int Socketk;
    public /* synthetic */ ArrayList Socketd;
    public /* synthetic */ int SocketC;
    public /* synthetic */ int Socketl;
    public /* synthetic */ ResourceLocation Socketa;
    public /* synthetic */ boolean SocketK;
    public /* synthetic */ ResourceLocation SocketG;
    public /* synthetic */ FACKCRACKMEAAAH SocketALLATORIxDEMOxURLConnection;

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, float a3) {
        int n;
        FACKCRACKMEAAAt a4;
        if (a4.SocketK) {
            a4.SocketK = a + a4.Socketl;
            a4.SocketG = (ResourceLocation)(a2 + a4.Socketk);
            n = 0;
            for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a4.Socketd) {
                int n2 = n;
                n += 10;
                fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection((int)a4.SocketK, (int)(a4.SocketG + n2));
            }
        }
        n = 0;
        if (a4.Socketf) {
            for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a4.Socketd) {
                n += 10;
                fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
            }
        }
        GlStateManager.func_179094_E();
        GlStateManager.func_179144_i((int)FACKCRACKMEAAAy.BufferedReaderALLATORIxDEMOxURLConnection().SocketG.func_110552_b());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.8f);
        GL11.glEnable((int)3042);
        a4.Socketl.field_71456_v.func_73729_b(a4.SocketK + 1 + 1, (int)a4.SocketG, 0, 0, a4.BufferedReaderj() - 4, a4.BufferedReaderALLATORIxDEMOxURLConnection() + n);
        GL11.glDisable((int)3042);
        GlStateManager.func_179121_F();
        if (a4.Socketa.equalsIgnoreCase("render")) {
            GlStateManager.func_179094_E();
            GlStateManager.func_179144_i((int)FACKCRACKMEAAAy.BufferedReaderALLATORIxDEMOxURLConnection().Socketl.func_110552_b());
            GL11.glEnable((int)3042);
            GL11.glScaled((double)0.28, (double)0.065, (double)0.28);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            a4.Socketl.field_71456_v.func_175174_a((float)a4.SocketK / 0.28f + 2.5f, (float)a4.SocketG / 0.065f - 90.0f, 0, 0, a4.BufferedReaderj() + 175, a4.BufferedReaderALLATORIxDEMOxURLConnection() + 235);
            GL11.glDisable((int)3042);
            GlStateManager.func_179121_F();
        }
        if (a4.Socketa.equalsIgnoreCase("combat")) {
            GlStateManager.func_179094_E();
            GlStateManager.func_179144_i((int)FACKCRACKMEAAAy.BufferedReaderALLATORIxDEMOxURLConnection().SocketK.func_110552_b());
            GL11.glEnable((int)3042);
            GL11.glScaled((double)0.28, (double)0.065, (double)0.28);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            a4.Socketl.field_71456_v.func_175174_a((float)a4.SocketK / 0.28f + 2.5f, (float)a4.SocketG / 0.065f - 90.0f, 0, 0, a4.BufferedReaderj() + 175, a4.BufferedReaderALLATORIxDEMOxURLConnection() + 235);
            GL11.glDisable((int)3042);
            GlStateManager.func_179121_F();
        }
        if (a4.Socketa.equalsIgnoreCase("misc")) {
            GlStateManager.func_179094_E();
            GlStateManager.func_179144_i((int)FACKCRACKMEAAAy.BufferedReaderALLATORIxDEMOxURLConnection().Socketk.func_110552_b());
            GL11.glEnable((int)3042);
            GL11.glScaled((double)0.28, (double)0.065, (double)0.28);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            a4.Socketl.field_71456_v.func_175174_a((float)a4.SocketK / 0.28f + 2.5f, (float)a4.SocketG / 0.065f - 90.0f, 0, 0, a4.BufferedReaderj() + 175, a4.BufferedReaderALLATORIxDEMOxURLConnection() + 235);
            GL11.glDisable((int)3042);
            GlStateManager.func_179121_F();
        }
        if (a4.Socketa.equalsIgnoreCase("movement")) {
            GlStateManager.func_179094_E();
            GlStateManager.func_179144_i((int)FACKCRACKMEAAAy.BufferedReaderALLATORIxDEMOxURLConnection().SocketB.func_110552_b());
            GL11.glEnable((int)3042);
            GL11.glScaled((double)0.28, (double)0.065, (double)0.28);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            a4.Socketl.field_71456_v.func_175174_a((float)a4.SocketK / 0.28f + 2.5f, (float)a4.SocketG / 0.065f - 90.0f, 0, 0, a4.BufferedReaderj() + 175, a4.BufferedReaderALLATORIxDEMOxURLConnection() + 235);
            GL11.glDisable((int)3042);
            GlStateManager.func_179121_F();
        }
        if (a4.Socketa.equalsIgnoreCase("player")) {
            GlStateManager.func_179094_E();
            GlStateManager.func_179144_i((int)FACKCRACKMEAAAy.BufferedReaderALLATORIxDEMOxURLConnection().Socketa.func_110552_b());
            GL11.glEnable((int)3042);
            GlStateManager.func_179086_m((int)256);
            GL11.glScaled((double)0.28, (double)0.065, (double)0.28);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            a4.Socketl.field_71456_v.func_175174_a((float)a4.SocketK / 0.28f + 2.5f, (float)a4.SocketG / 0.065f - 90.0f, 0, 0, a4.BufferedReaderj() + 175, a4.BufferedReaderALLATORIxDEMOxURLConnection() + 235);
            GL11.glDisable((int)3042);
            GlStateManager.func_179121_F();
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
    }

    public /* synthetic */ FACKCRACKMEAAAt(String a9, int a2, int a32, int a4, int a5, FACKCRACKMEAAAu a6, FACKCRACKMEAAAT a7) {
        super(a9, a2, a32, a4, a5, a6);
        FACKCRACKMEAAAt a8;
        a8.SocketG = new ResourceLocation("rline:textures/line.png");
        a8.Socketa = new ResourceLocation("rline:textures/carbon.png");
        a8.Socketd = new ArrayList();
        a8.Socketc = a7;
        a8.SocketK = false;
        int a9 = 0;
        a8.Socketd.clear();
        for (Object a32 : FACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection(a8.Socketc)) {
            a32 = new FACKCRACKMEAAAW(((FACKCRACKMEAAAH)a32).BufferedReaderALLATORIxDEMOxURLConnection(), (int)a8.SocketK, (int)(a8.SocketG + a9), a8.BufferedReaderj(), a8.BufferedReaderALLATORIxDEMOxURLConnection(), (FACKCRACKMEAAAu)((Object)a8.SocketALLATORIxDEMOxURLConnection), (FACKCRACKMEAAAH)a32);
            a9 += 10;
            a8.Socketd.add(a32);
        }
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(char a, int a2) throws IOException {
        FACKCRACKMEAAAt a3;
        Iterator iterator = a3.Socketd.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderALLATORIxDEMOxURLConnection(a, a2);
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2);
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, int a3) throws IOException {
        FACKCRACKMEAAAt a4;
        for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a4.Socketd) {
            if (!a4.Socketf) continue;
            fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
        }
        if (a4.BufferedReaderj(a, a2)) {
            a4.SocketK = true;
            a4.Socketl = a4.SocketK - a;
            a4.Socketk = (int)(a4.SocketG - a2);
        }
        if (a4.BufferedReaderj(a, a2) && a3 == 1) {
            a4.Socketi = !a4.Socketf;
            a4.Socketf = !a4.Socketf;
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
    }

    @Override
    public /* synthetic */ void BufferedReaderj(int a, int a2, int a3) {
        FACKCRACKMEAAAt a4;
        a4.SocketK = false;
        super.BufferedReaderj(a, a2, a3);
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection() {
        FACKCRACKMEAAAt a;
        Iterator iterator = a.Socketd.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderALLATORIxDEMOxURLConnection();
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection();
    }
}

