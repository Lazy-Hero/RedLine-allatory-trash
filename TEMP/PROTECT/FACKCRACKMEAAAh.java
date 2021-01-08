/*
 * Decompiled with CFR 0.150.
 */
package TEMP.PROTECT;

import java.awt.Color;

public class FACKCRACKMEAAAh {
    public static /* synthetic */ int BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, int a3) {
        return 0xFF000000 | a << 16 | a2 << 8 | a3;
    }

    public /* synthetic */ FACKCRACKMEAAAh() {
        FACKCRACKMEAAAh a;
    }

    public static /* synthetic */ int BufferedReaderALLATORIxDEMOxURLConnection(float a, float a2, float a3, float a4) {
        return new Color(a, a2, a3, a4).getRGB();
    }

    public /* synthetic */ Color BufferedReaderj(float a4, float a2, int a3) {
        long l = Long.parseLong(Integer.toHexString(Color.HSBtoRGB(((float)System.nanoTime() + a4 * (float)a3) / 1.0E10f % 1.0f, a2, 1.0f)), 16);
        Color a4 = new Color((int)l);
        return new Color((float)a4.getRed() / 255.0f, (float)a4.getGreen() / 255.0f, (float)a4.getBlue() / 255.0f, (float)a4.getAlpha() / 255.0f);
    }

    public static /* synthetic */ Color BufferedReaderALLATORIxDEMOxURLConnection() {
        long l = 999999999999L;
        float f = 1.0f;
        long l2 = Long.parseLong(Integer.toHexString(Color.HSBtoRGB((float)(System.nanoTime() + l) / 1.0E10f % 1.0f, 1.0f, 1.0f)), 16);
        Color color = new Color((int)l2);
        return new Color((float)color.getRed() / 255.0f * f, (float)color.getGreen() / 255.0f * f, (float)color.getBlue() / 255.0f * f, (float)color.getAlpha() / 255.0f);
    }

    public static /* synthetic */ int BufferedReaderj(int a, int a2, int a3, int a4) {
        return new Color(a, a2, a3, a4).getRGB();
    }

    public static /* synthetic */ int BufferedReaderALLATORIxDEMOxURLConnection(int a, int a2, int a3, int a4) {
        return a << 24 | a2 << 16 | a3 << 8 | a4;
    }

    public /* synthetic */ Color BufferedReaderALLATORIxDEMOxURLConnection(float a4, float a2, int a3) {
        long l = Long.parseLong(Integer.toHexString(Color.HSBtoRGB(((float)System.nanoTime() + a4 * (float)a3) / 1.0E10f % 1.0f, a2, 1.0f)), 16);
        Color a4 = new Color((int)l);
        return new Color((float)a4.getRed() / 255.0f, 0.0f, 0.0f, (float)a4.getAlpha() / 255.0f);
    }
}

