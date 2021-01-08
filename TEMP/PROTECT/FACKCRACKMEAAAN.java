/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.input.Mouse
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAX;
import TEMP.PROTECT.FACKCRACKMEAAAd;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import TEMP.PROTECT.FACKCRACKMEAAAu;
import java.io.IOException;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.input.Mouse;

public class FACKCRACKMEAAAN
extends FACKCRACKMEAAAX {
    private /* synthetic */ double Socketa;
    public /* synthetic */ FACKCRACKMEAAAp SocketK;
    public /* synthetic */ FACKCRACKMEAAAH SocketG;
    public /* synthetic */ boolean SocketALLATORIxDEMOxURLConnection;

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, float a3) {
        FACKCRACKMEAAAN a4;
        ScaledResolution scaledResolution = new ScaledResolution(a4.Socketl);
        a -= a4.SocketK;
        double d = Mouse.getX() * scaledResolution.func_78326_a() / a4.Socketl.field_71443_c;
        double d2 = a4.SocketK.BufferedReaderj() - a4.SocketK.BufferedReadera();
        d = MathHelper.func_151237_a((double)((d - (double)a4.SocketK) / (double)a4.SocketH), (double)0.0, (double)1.0);
        d2 = a4.SocketK.BufferedReadera() + d * d2;
        if (a4.SocketALLATORIxDEMOxURLConnection) {
            a4.SocketK.BufferedReaderALLATORIxDEMOxURLConnection(d2);
            a4.Socketa = d;
        }
        if (a4.BufferedReaderALLATORIxDEMOxURLConnection(a, (float)a2)) {
            System.out.println(1);
        }
        a4.Socketl.field_71466_p.func_78276_b(String.valueOf(a4.SocketK.BufferedReaderALLATORIxDEMOxURLConnection()), (int)(a4.SocketK + 3 + a4.BufferedReaderj()), (int)(a4.SocketG - 2 - a4.BufferedReaderALLATORIxDEMOxURLConnection()), -1);
        a4.Socketl.field_71466_p.func_78276_b(String.valueOf(new StringBuilder().insert(0, a4.SocketK.BufferedReaderALLATORIxDEMOxURLConnection()).append(":").toString()), (int)a4.SocketK, (int)(a4.SocketG - 4 - a4.BufferedReaderALLATORIxDEMOxURLConnection() - 4), -1);
        FACKCRACKMEAAAd.BufferedReaderALLATORIxDEMOxURLConnection((double)a4.SocketK, (double)a4.SocketG, (double)(a4.SocketK + a4.BufferedReaderj()), (double)(a4.SocketG + a4.BufferedReaderALLATORIxDEMOxURLConnection()), -1);
        FACKCRACKMEAAAd.BufferedReaderALLATORIxDEMOxURLConnection((double)a4.SocketK, (double)a4.SocketG, (double)a4.SocketK + a4.Socketa * (double)a4.BufferedReaderj(), (double)(a4.SocketG + a4.BufferedReaderALLATORIxDEMOxURLConnection()), -65536);
        FACKCRACKMEAAAd.BufferedReaderALLATORIxDEMOxURLConnection((float)((double)a4.SocketK + a4.Socketa * (double)a4.BufferedReaderj()), (float)(a4.SocketG + true), 2.0f, 3, -65536, -1);
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, int a3) throws IOException {
        FACKCRACKMEAAAN a4;
        if (a4.BufferedReaderALLATORIxDEMOxURLConnection(a, (float)a2)) {
            a4.SocketALLATORIxDEMOxURLConnection = true;
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
    }

    @Override
    public /* synthetic */ void BufferedReaderj(int a, int a2, int a3) {
        FACKCRACKMEAAAN a4;
        a4.SocketALLATORIxDEMOxURLConnection = false;
        super.BufferedReaderj(a, a2, a3);
    }

    public /* synthetic */ FACKCRACKMEAAAN(String a, int a2, int a3, int a4, int a5, FACKCRACKMEAAAu a6, FACKCRACKMEAAAH a7, FACKCRACKMEAAAp a8) {
        super(a, a2, a3, a4, a5, a6);
        FACKCRACKMEAAAN a9;
        a9.SocketG = a7;
        a9.SocketK = a8;
        a9.SocketALLATORIxDEMOxURLConnection = false;
        a9.Socketa = a8.BufferedReaderALLATORIxDEMOxURLConnection() / a8.BufferedReaderj();
    }
}

