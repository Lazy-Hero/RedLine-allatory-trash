/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.ResourceLocation
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAN;
import TEMP.PROTECT.FACKCRACKMEAAAO;
import TEMP.PROTECT.FACKCRACKMEAAAS;
import TEMP.PROTECT.FACKCRACKMEAAAX;
import TEMP.PROTECT.FACKCRACKMEAAAe;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import TEMP.PROTECT.FACKCRACKMEAAAr;
import TEMP.PROTECT.FACKCRACKMEAAAu;
import TEMP.PROTECT.FACKCRACKMEAAAy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

public class FACKCRACKMEAAAV
extends GuiScreen {
    public /* synthetic */ FACKCRACKMEAAAH Sockete;
    public /* synthetic */ FACKCRACKMEAAAu Socketa;
    public /* synthetic */ int SocketK;
    public /* synthetic */ int SocketG;
    public /* synthetic */ ArrayList SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ void func_73863_a(int a, int a2, float a3) {
        FACKCRACKMEAAAV a4;
        ScaledResolution scaledResolution = new ScaledResolution(a4.field_146297_k);
        int n = scaledResolution.func_78326_a() / 2;
        int n2 = scaledResolution.func_78328_b() / 2;
        if (a4.SocketG != n) {
            a4.SocketG = n;
        }
        if (a4.SocketK != n2) {
            a4.SocketK = n2;
        }
        Gui.func_73734_a((int)(a4.SocketG - 75), (int)(a4.SocketK - 125), (int)(a4.SocketG + 75), (int)(a4.SocketK + 125), (int)Integer.MIN_VALUE);
        a4.field_146297_k.field_71466_p.func_78276_b("Back", a4.SocketG + 74 - a4.field_146297_k.field_71466_p.func_78256_a("Back"), a4.SocketK - 123, a4.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a4.SocketG + 50, a4.SocketK - 123, a4.field_146297_k.field_71466_p.func_78256_a("Back"), a4.field_146297_k.field_71466_p.field_78288_b) ? 0xFF0000 : 0xFFFFFF);
        a4.field_146297_k.field_71466_p.func_78276_b(new StringBuilder().insert(0, "\u00a74\u00a7l").append(a4.Sockete.BufferedReaderALLATORIxDEMOxURLConnection()).toString(), a4.SocketG - a4.field_146297_k.field_71466_p.func_78256_a(a4.Sockete.BufferedReaderALLATORIxDEMOxURLConnection()) / 2, a4.SocketK - 140, 0xFFFFFF);
        n = 0;
        for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a4.SocketALLATORIxDEMOxURLConnection) {
            if (fACKCRACKMEAAAX instanceof FACKCRACKMEAAAS) {
                int n3 = n;
                n += 15;
                fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection(a4.SocketG, a4.SocketK + n3);
            }
            if (fACKCRACKMEAAAX instanceof FACKCRACKMEAAAN) {
                int n4 = n += 10;
                n += 5;
                fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection(a4.SocketG - 72, a4.SocketK - 125 + n4);
            }
            fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
        }
        super.func_73863_a(a, a2, a3);
    }

    public /* synthetic */ void func_73864_a(int a, int a2, int a3) throws IOException {
        FACKCRACKMEAAAV a4;
        Iterator iterator = a4.SocketALLATORIxDEMOxURLConnection.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
        }
        if (a4.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a4.SocketG + 50, a4.SocketK - 123, a4.field_146297_k.field_71466_p.func_78256_a("Back"), a4.field_146297_k.field_71466_p.field_78288_b)) {
            a4.field_146297_k.func_147108_a((GuiScreen)FACKCRACKMEAAAy.BufferedReaderALLATORIxDEMOxURLConnection());
        }
        super.func_73864_a(a, a2, a3);
    }

    public /* synthetic */ void func_73869_a(char a, int a2) throws IOException {
        FACKCRACKMEAAAV a3;
        Iterator iterator = a3.SocketALLATORIxDEMOxURLConnection.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderALLATORIxDEMOxURLConnection(a, a2);
        }
        super.func_73869_a(a, a2);
    }

    public /* synthetic */ void func_73866_w_() {
        FACKCRACKMEAAAV a;
        if (!a.field_146297_k.field_71460_t.func_147702_a()) {
            a.field_146297_k.field_71460_t.func_175069_a(new ResourceLocation("shaders/post/blur.json"));
        }
        super.func_73866_w_();
    }

    public /* synthetic */ boolean func_73868_f() {
        return false;
    }

    private /* synthetic */ boolean BufferedReaderALLATORIxDEMOxURLConnection(int a, float a2, int a3, int a4, int a5, int a6) {
        return a >= a3 && a - a5 <= a3 && a2 >= (float)a4 && a2 - (float)a6 <= (float)a4;
    }

    public /* synthetic */ void func_146281_b() {
        FACKCRACKMEAAAV a;
        if (a.field_146297_k.field_71460_t.func_147702_a()) {
            FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection();
        }
        super.func_146281_b();
    }

    public /* synthetic */ FACKCRACKMEAAAV(int a, int a22, FACKCRACKMEAAAu a32, FACKCRACKMEAAAH a4) {
        FACKCRACKMEAAAV a5;
        a5.Sockete = a4;
        a5.Socketa = a32;
        a5.SocketG = a;
        a5.SocketK = a22;
        a5.SocketALLATORIxDEMOxURLConnection = new ArrayList();
        a = 0;
        for (Object a32 : a5.Sockete.BufferedReaderd()) {
            if (a32 == null) continue;
            a4 = new FACKCRACKMEAAAS(((FACKCRACKMEAAAr)a32).BufferedReaderALLATORIxDEMOxURLConnection(), a5.SocketG, a5.SocketK + a, 10, 10, a5.Socketa, a5.Sockete, (FACKCRACKMEAAAr)a32);
            a += 40;
            a5.SocketALLATORIxDEMOxURLConnection.add(a4);
        }
        for (Object a32 : a5.Sockete.BufferedReaderALLATORIxDEMOxURLConnection()) {
            if (a32 == null) continue;
            a4 = new FACKCRACKMEAAAN(((FACKCRACKMEAAAp)a32).BufferedReaderALLATORIxDEMOxURLConnection(), a5.SocketG, a5.SocketK + a, 50, 2, a5.Socketa, a5.Sockete, (FACKCRACKMEAAAp)a32);
            a += 40;
            a5.SocketALLATORIxDEMOxURLConnection.add(a4);
        }
        for (Object a32 : a5.Sockete.BufferedReaderj()) {
            if (a32 == null) continue;
        }
        FACKCRACKMEAAAO a22 = new FACKCRACKMEAAAO("", a5.SocketG - 73, a5.SocketK + 115, a5.SocketG + 30, a5.SocketK + 30, a5.Socketa, a5.Sockete);
        a5.SocketALLATORIxDEMOxURLConnection.add(a22);
    }

    public /* synthetic */ void func_146286_b(int a, int a2, int a3) {
        FACKCRACKMEAAAV a4;
        Iterator iterator = a4.SocketALLATORIxDEMOxURLConnection.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderj(a, a2, a3);
        }
        super.func_146286_b(a, a2, a3);
    }
}

