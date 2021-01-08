/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.input.Keyboard
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAV;
import TEMP.PROTECT.FACKCRACKMEAAAX;
import TEMP.PROTECT.FACKCRACKMEAAAu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.input.Keyboard;

public class FACKCRACKMEAAAW
extends FACKCRACKMEAAAX {
    public /* synthetic */ ArrayList Sockete;
    public /* synthetic */ boolean Socketa;
    public /* synthetic */ boolean SocketK;
    public /* synthetic */ FACKCRACKMEAAAH SocketG;
    public /* synthetic */ ArrayList SocketALLATORIxDEMOxURLConnection;

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(char a, int a2) throws IOException {
        FACKCRACKMEAAAW a3;
        Iterator iterator = a3.Sockete.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderALLATORIxDEMOxURLConnection(a, a2);
        }
        if (a3.SocketK) {
            if (a2 == 211) {
                a3.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(0);
                a3.SocketK = false;
                return;
            }
            if (a2 != 1) {
                a3.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(a2);
                a3.SocketK = false;
            }
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2);
    }

    public /* synthetic */ FACKCRACKMEAAAW(String a, int a2, int a3, int a4, int a5, FACKCRACKMEAAAu a6, FACKCRACKMEAAAH a7) {
        super(a, a2, a3, a4, a5, a6);
        FACKCRACKMEAAAW a8;
        a8.SocketG = a7;
        a8.Sockete = new ArrayList();
        a8.SocketALLATORIxDEMOxURLConnection = new ArrayList();
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, int a3) throws IOException {
        FACKCRACKMEAAAW a4;
        if (a4.Socketa) {
            return;
        }
        if (a4.BufferedReaderALLATORIxDEMOxURLConnection(a, (float)(a2 - a4.BufferedReaderALLATORIxDEMOxURLConnection()) - 0.5f)) {
            a4.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(!a4.SocketG.BufferedReaderALLATORIxDEMOxURLConnection());
            if (a3 == 1 && a4.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(a4.SocketG)) {
                ScaledResolution scaledResolution = new ScaledResolution(a4.Socketl);
                int n = scaledResolution.func_78326_a() / 2;
                int n2 = scaledResolution.func_78328_b() / 2;
                a4.Socketl.func_147108_a((GuiScreen)new FACKCRACKMEAAAV(n, n2, a4.BufferedReaderALLATORIxDEMOxURLConnection(), a4.SocketG));
            }
            if (a3 == 2) {
                a4.SocketK = true;
                return;
            }
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, float a3) {
        FACKCRACKMEAAAW a4;
        GlStateManager.func_179117_G();
        if (a4.SocketK) {
            for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a4.Sockete) {
                fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
            }
        }
        if (a4.Socketa) {
            for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a4.SocketALLATORIxDEMOxURLConnection) {
                fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
            }
        }
        if (!a4.SocketK) {
            if (a4.SocketG.BufferedReaderALLATORIxDEMOxURLConnection()) {
                a4.Socketl.field_71466_p.func_78276_b((String)a4.Socketa, a4.SocketK + a4.BufferedReaderj() / 2 - a4.Socketl.field_71466_p.func_78256_a(a4.BufferedReaderALLATORIxDEMOxURLConnection()) / 2, (int)(a4.SocketG + a4.BufferedReaderALLATORIxDEMOxURLConnection() + 2), 0xFF0000);
            } else {
                a4.Socketl.field_71466_p.func_78276_b((String)a4.Socketa, a4.SocketK + a4.BufferedReaderj() / 2 - a4.Socketl.field_71466_p.func_78256_a(a4.BufferedReaderALLATORIxDEMOxURLConnection()) / 2, (int)(a4.SocketG + a4.BufferedReaderALLATORIxDEMOxURLConnection() + 2), 0xFFFFFF);
            }
        } else {
            a4.Socketl.field_71466_p.func_78276_b(Keyboard.getKeyName((int)a4.SocketG.BufferedReaderALLATORIxDEMOxURLConnection()), a4.SocketK + a4.BufferedReaderj() / 2 - a4.Socketl.field_71466_p.func_78256_a(Keyboard.getKeyName((int)a4.SocketG.BufferedReaderALLATORIxDEMOxURLConnection())) / 2, (int)(a4.SocketG + a4.BufferedReaderALLATORIxDEMOxURLConnection() + 2), 16753920);
        }
        if (a4.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(a4.SocketG)) {
            a4.Socketl.field_71466_p.func_78276_b(">", a4.SocketK + a4.BufferedReaderj() - a4.Socketl.field_71466_p.func_78256_a(">") - 1, (int)(a4.SocketG + a4.BufferedReaderALLATORIxDEMOxURLConnection() + 2), 0xFFFFFF);
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
    }
}

