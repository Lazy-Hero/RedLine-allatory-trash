/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.util.ResourceLocation
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAX;
import TEMP.PROTECT.FACKCRACKMEAAAe;
import TEMP.PROTECT.FACKCRACKMEAAAt;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

public class FACKCRACKMEAAAu
extends GuiScreen {
    public /* synthetic */ int Socketf;
    public /* synthetic */ boolean Socketc;
    public /* synthetic */ DynamicTexture SocketB;
    public /* synthetic */ int Socketb;
    public /* synthetic */ int Socketi;
    public /* synthetic */ DynamicTexture Socketk;
    public /* synthetic */ int Socketd;
    public /* synthetic */ int SocketC;
    public /* synthetic */ DynamicTexture Socketl;
    public /* synthetic */ Minecraft SocketH;
    public /* synthetic */ int Sockete;
    public /* synthetic */ DynamicTexture Socketa;
    public /* synthetic */ DynamicTexture SocketK;
    public /* synthetic */ DynamicTexture SocketG;
    public /* synthetic */ ArrayList SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ FACKCRACKMEAAAu() {
        FACKCRACKMEAAAu a;
        a.SocketH = Minecraft.func_71410_x();
        a.SocketALLATORIxDEMOxURLConnection = new ArrayList();
        a.Socketc = false;
        a.SocketC = 40;
        a.Socketi = 40;
        a.Socketd = 0;
        a.Socketb = 0;
        a.Sockete = 0;
        a.Socketf = 0;
        try {
            a.SocketK = new DynamicTexture(ImageIO.read(new URL("https://redline.run/combat.png")));
            a.Socketl = new DynamicTexture(ImageIO.read(new URL("https://redline.run/render.png")));
            a.Socketa = new DynamicTexture(ImageIO.read(new URL("https://redline.run/player.png")));
            a.Socketk = new DynamicTexture(ImageIO.read(new URL("https://redline.run/misc.png")));
            a.SocketB = new DynamicTexture(ImageIO.read(new URL("https://redline.run/movement.png")));
            a.SocketG = new DynamicTexture(ImageIO.read(new URL("https://redline.run/carbon.png")));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ boolean BufferedReaderALLATORIxDEMOxURLConnection(int a, float a2, int a3, int a4, int a5, int a6) {
        return a >= a3 && a - a5 <= a3 && a2 >= (float)a4 && a2 - (float)a6 <= (float)a4;
    }

    public /* synthetic */ void func_73864_a(int a, int a2, int a3) throws IOException {
        FACKCRACKMEAAAu a4;
        Iterator iterator = a4.SocketALLATORIxDEMOxURLConnection.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
        }
        if (a4.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a4.Socketd, a4.Socketb, a4.SocketC, 10)) {
            a4.Socketc = true;
            a4.Socketf = a4.Socketd - a;
            a4.Sockete = a4.Socketb - a2;
        }
        super.func_73864_a(a, a2, a3);
    }

    public /* synthetic */ void func_73869_a(char a, int a2) throws IOException {
        FACKCRACKMEAAAu a3;
        Iterator iterator = a3.SocketALLATORIxDEMOxURLConnection.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderALLATORIxDEMOxURLConnection(a, a2);
        }
        super.func_73869_a(a, a2);
    }

    public /* synthetic */ void func_146286_b(int a, int a2, int a3) {
        FACKCRACKMEAAAu a4;
        Iterator iterator = a4.SocketALLATORIxDEMOxURLConnection.iterator();
        while (iterator.hasNext()) {
            ((FACKCRACKMEAAAX)iterator.next()).BufferedReaderj(a, a2, a3);
        }
        a4.Socketc = false;
        super.func_146286_b(a, a2, a3);
    }

    public /* synthetic */ void func_146281_b() {
        FACKCRACKMEAAAu a;
        if (a.SocketH.field_71460_t.func_147702_a()) {
            FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection();
        }
        super.func_146281_b();
    }

    public /* synthetic */ boolean func_73868_f() {
        return false;
    }

    public /* synthetic */ void func_73863_a(int a, int a2, float a3) {
        FACKCRACKMEAAAu a4;
        if (a4.Socketc) {
            a4.Socketd = a + a4.Socketf;
            a4.Socketb = a2 + a4.Sockete;
        }
        for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a4.SocketALLATORIxDEMOxURLConnection) {
            if (fACKCRACKMEAAAX instanceof FACKCRACKMEAAAt) {
                ((FACKCRACKMEAAAt)fACKCRACKMEAAAX).SocketB = false;
            }
            fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
        }
        super.func_73863_a(a, a2, a3);
    }

    private /* synthetic */ boolean BufferedReaderALLATORIxDEMOxURLConnection(FACKCRACKMEAAAt a) {
        FACKCRACKMEAAAu a2;
        for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a2.SocketALLATORIxDEMOxURLConnection) {
            if (!(fACKCRACKMEAAAX instanceof FACKCRACKMEAAAt) || !((FACKCRACKMEAAAt)fACKCRACKMEAAAX).BufferedReaderALLATORIxDEMOxURLConnection().equalsIgnoreCase(a.BufferedReaderALLATORIxDEMOxURLConnection())) continue;
            return true;
        }
        return false;
    }

    public /* synthetic */ void func_73866_w_() {
        FACKCRACKMEAAAu a;
        if (!a.SocketH.field_71460_t.func_147702_a()) {
            a.SocketH.field_71460_t.func_175069_a(new ResourceLocation("shaders/post/blur.json"));
        }
        int n = 0;
        int n2 = 15;
        ScaledResolution scaledResolution = new ScaledResolution(a.SocketH);
        a.Socketd = scaledResolution.func_78326_a() / 2 - a.SocketC / 2;
        a.Socketb = scaledResolution.func_78328_b() / 2 - a.Socketi / 2;
        for (Object object : FACKCRACKMEAAAT.values()) {
            String string = object.name();
            object = new FACKCRACKMEAAAt(string, n, n2, 70, 10, a, (FACKCRACKMEAAAT)((Object)object));
            n += ((FACKCRACKMEAAAt)object).SocketH + 5;
            if (a.BufferedReaderALLATORIxDEMOxURLConnection((FACKCRACKMEAAAt)object)) continue;
            a.SocketALLATORIxDEMOxURLConnection.add(object);
        }
        for (FACKCRACKMEAAAX fACKCRACKMEAAAX : a.SocketALLATORIxDEMOxURLConnection) {
            fACKCRACKMEAAAX.BufferedReaderALLATORIxDEMOxURLConnection();
        }
        super.func_73866_w_();
    }

    public /* synthetic */ void func_146270_b(int a) {
        FACKCRACKMEAAAu a2;
        super.func_146270_b(0);
    }
}

