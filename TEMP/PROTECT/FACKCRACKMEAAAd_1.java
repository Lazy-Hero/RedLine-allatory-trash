/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.AxisAlignedBB
 *  org.lwjgl.opengl.GL11
 */
package TEMP.PROTECT;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public class FACKCRACKMEAAAd {
    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(double a, double a2, double a3, double a4, int a52) {
        if (a < a3) {
            double d = a;
            a = a3;
            a3 = d;
        }
        if (a2 < a4) {
            double d = a2;
            a2 = a4;
            a4 = d;
        }
        float f = (float)(a52 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(a52 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(a52 >> 8 & 0xFF) / 255.0f;
        float a52 = (float)(a52 & 0xFF) / 255.0f;
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        GlStateManager.func_179147_l();
        GlStateManager.func_179090_x();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.func_179131_c((float)f2, (float)f3, (float)a52, (float)f);
        double d = a3;
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181705_e);
        bufferBuilder.func_181662_b(a, a4, 0.0).func_181675_d();
        bufferBuilder.func_181662_b(d, a4, 0.0).func_181675_d();
        bufferBuilder.func_181662_b(d, a2, 0.0).func_181675_d();
        bufferBuilder.func_181662_b(a, a2, 0.0).func_181675_d();
        tessellator.func_78381_a();
        GlStateManager.func_179098_w();
        GlStateManager.func_179084_k();
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(float a, float a2, float a3, int a4, int a5, int a6) {
        FACKCRACKMEAAAd.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3, a6);
        FACKCRACKMEAAAd.BufferedReaderALLATORIxDEMOxURLConnection(a, a2, a3, (float)a4, a5);
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(double a, double a2, double a3, Color a4, double a5, double a6) {
        GL11.glPushMatrix();
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4d((double)((float)a4.getRed() / 255.0f), (double)((float)a4.getGreen() / 255.0f), (double)((float)a4.getBlue() / 255.0f), (double)((float)a4.getAlpha() / 255.0f));
        FACKCRACKMEAAAd.BufferedReaderALLATORIxDEMOxURLConnection(new AxisAlignedBB(a - 0.3, a2, a3 - 0.3, a + a6, a2 + 1.8, a3 + a5), 0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)0.5);
        GL11.glLineWidth((float)2.0f);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(float a, float a2, float a3, int a422) {
        float f = (float)(a422 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(a422 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(a422 >> 8 & 0xFF) / 255.0f;
        float a422 = (float)(a422 & 0xFF) / 255.0f;
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)2848);
        boolean bl3 = GL11.glIsEnabled((int)3553);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)f2, (float)f3, (float)a422, (float)f);
        GL11.glBegin((int)9);
        for (int a422 = 0; a422 <= 360; ++a422) {
            GL11.glVertex2d((double)((double)a + Math.sin((double)a422 * 3.1415926535 / 180.0) * (double)a3), (double)((double)a2 + Math.cos((double)a422 * 3.1415926535 / 180.0) * (double)a3));
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
    }

    public /* synthetic */ FACKCRACKMEAAAd() {
        FACKCRACKMEAAAd a;
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(AxisAlignedBB a, float a2, float a3, float a4, float a5) {
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        tessellator.func_78381_a();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        tessellator.func_78381_a();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        tessellator.func_78381_a();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        tessellator.func_78381_a();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        tessellator.func_78381_a();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72340_a, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72339_c).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72337_e, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        bufferBuilder.func_181662_b(a.field_72336_d, a.field_72338_b, a.field_72334_f).func_181666_a(a2, a3, a4, a5).func_181675_d();
        tessellator.func_78381_a();
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(ResourceLocation a, float a2, float a3, float a4, float a5) {
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)255.0f);
        float f = (a4 + a5) / 2.0f;
        int n = Math.round(f);
        GL11.glEnable((int)3042);
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
        GL11.glDisable((int)3042);
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(float a, float a2, float a3, float a42, int a52) {
        float f = (float)(a52 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(a52 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(a52 & 0xFF) / 255.0f;
        float a52 = (float)(a52 >> 24 & 0xFF) / 255.0f;
        GL11.glEnable((int)2848);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        GlStateManager.func_179147_l();
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)a52);
        GL11.glLineWidth((float)a42);
        GL11.glBegin((int)2);
        for (int a42 = 0; a42 <= 360; ++a42) {
            GL11.glVertex2d((double)((double)a + Math.sin((double)a42 * Math.PI / 180.0) * (double)a3), (double)((double)a2 + Math.cos((double)a42 * Math.PI / 180.0) * (double)a3));
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glHint((int)3155, (int)4352);
        GlStateManager.func_179084_k();
    }
}

