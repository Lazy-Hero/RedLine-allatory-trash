/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAX;
import TEMP.PROTECT.FACKCRACKMEAAAu;
import java.io.IOException;
import org.lwjgl.input.Keyboard;

public class FACKCRACKMEAAAO
extends FACKCRACKMEAAAX {
    public /* synthetic */ FACKCRACKMEAAAH SocketK;
    public /* synthetic */ boolean SocketG;
    public /* synthetic */ int SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ FACKCRACKMEAAAO(String a, int a2, int a3, int a4, int a5, FACKCRACKMEAAAu a6, FACKCRACKMEAAAH a7) {
        super(a, a2, a3, a4, a5, a6);
        FACKCRACKMEAAAO a8;
        a8.SocketK = a7;
        a8.SocketALLATORIxDEMOxURLConnection = a7.BufferedReaderALLATORIxDEMOxURLConnection();
        a8.SocketG = false;
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(char a, int a2) throws IOException {
        FACKCRACKMEAAAO a3;
        if (!a3.SocketG) {
            return;
        }
        if (a2 == 211) {
            a3.SocketK.BufferedReaderALLATORIxDEMOxURLConnection(0);
            a3.SocketG = false;
            return;
        }
        if (a2 != 1) {
            a3.SocketK.BufferedReaderALLATORIxDEMOxURLConnection(a2);
            a3.SocketG = false;
        }
        if (a2 == 1) {
            a3.SocketG = false;
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2);
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, int a3) throws IOException {
        FACKCRACKMEAAAO a4;
        if (a4.SocketG) {
            return;
        }
        if (a4.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, (int)a4.SocketK, a4.SocketG - 2, a4.Socketl.field_71466_p.func_78256_a(new StringBuilder().insert(0, "BINDING: ").append(Keyboard.getKeyName((int)a4.SocketK.BufferedReaderALLATORIxDEMOxURLConnection())).toString()), a4.Socketl.field_71466_p.field_78288_b)) {
            a4.SocketG = true;
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
    }

    private /* synthetic */ boolean BufferedReaderALLATORIxDEMOxURLConnection(int a, float a2, int a3, int a4, int a5, int a6) {
        return a >= a3 && a - a5 <= a3 && a2 >= (float)a4 && a2 - (float)a6 <= (float)a4;
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, float a3) {
        FACKCRACKMEAAAO a4;
        if (!a4.SocketG) {
            if (a4.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, (int)a4.SocketK, a4.SocketG - 2, a4.Socketl.field_71466_p.func_78256_a(new StringBuilder().insert(0, "BINDING: ").append(Keyboard.getKeyName((int)a4.SocketK.BufferedReaderALLATORIxDEMOxURLConnection())).toString()), a4.Socketl.field_71466_p.field_78288_b)) {
                a4.Socketl.field_71466_p.func_78276_b(new StringBuilder().insert(0, "BINDING: ").append(Keyboard.getKeyName((int)a4.SocketK.BufferedReaderALLATORIxDEMOxURLConnection())).toString(), (int)a4.SocketK, (int)a4.SocketG, 0xFF0000);
            } else {
                a4.Socketl.field_71466_p.func_78276_b(new StringBuilder().insert(0, "BINDING: ").append(Keyboard.getKeyName((int)a4.SocketK.BufferedReaderALLATORIxDEMOxURLConnection())).toString(), (int)a4.SocketK, (int)a4.SocketG, 0xFFFFFF);
            }
        }
        if (a4.SocketG) {
            a4.Socketl.field_71466_p.func_78276_b("Press a key...", (int)a4.SocketK, (int)a4.SocketG, 0xFFFFFF);
        }
        super.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3);
    }
}

