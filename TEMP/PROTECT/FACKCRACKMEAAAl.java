/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAh;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import TEMP.PROTECT.FACKCRACKMEAAAr;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class FACKCRACKMEAAAl
extends FACKCRACKMEAAAH {
    public /* synthetic */ boolean SocketH;
    private /* synthetic */ FACKCRACKMEAAAp Sockete;
    private /* synthetic */ FACKCRACKMEAAAp Socketa;
    private /* synthetic */ FACKCRACKMEAAAr SocketK;
    private /* synthetic */ FACKCRACKMEAAAp SocketG;
    private /* synthetic */ FACKCRACKMEAAAp SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ Vec3d BufferedReaderALLATORIxDEMOxURLConnection() {
        FACKCRACKMEAAAl a;
        EntityPlayerSP entityPlayerSP = ((Minecraft)a.Sockete).field_71439_g;
        float f = MathHelper.func_76134_b((float)(-entityPlayerSP.field_70177_z * ((float)Math.PI / 180) - (float)Math.PI));
        float f2 = MathHelper.func_76126_a((float)(-entityPlayerSP.field_70177_z * ((float)Math.PI / 180) - (float)Math.PI));
        float f3 = -MathHelper.func_76134_b((float)(-entityPlayerSP.field_70125_A * ((float)Math.PI / 180)));
        float f4 = MathHelper.func_76126_a((float)(-entityPlayerSP.field_70125_A * ((float)Math.PI / 180)));
        return new Vec3d((double)(f2 * f3), (double)f4, (double)(f * f3));
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(Color a) {
        GL11.glColor4f((float)((float)a.getRed() / 255.0f), (float)((float)a.getGreen() / 255.0f), (float)((float)a.getBlue() / 255.0f), (float)((float)a.getAlpha() / 255.0f));
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection() {
        FACKCRACKMEAAAl a;
        a.SocketH = a.Sockete.field_71474_y.field_74336_f;
    }

    @Override
    public /* synthetic */ void BufferedReaderj() {
        FACKCRACKMEAAAl a;
        a.Sockete.field_71474_y.field_74336_f = a.SocketH;
    }

    public /* synthetic */ FACKCRACKMEAAAl() {
        super("Tracers", 0, FACKCRACKMEAAAT.SocketALLATORIxDEMOxURLConnection);
        FACKCRACKMEAAAl a;
        a.SocketALLATORIxDEMOxURLConnection = new FACKCRACKMEAAAp("Red", 255.0, 1.0, 255.0);
        a.SocketG = new FACKCRACKMEAAAp("Green", 255.0, 1.0, 255.0);
        a.Socketa = new FACKCRACKMEAAAp("Blue", 255.0, 1.0, 255.0);
        a.SocketK = new FACKCRACKMEAAAr("Rainbow", false);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketK);
        a.Sockete = new FACKCRACKMEAAAp("Opacity", 255.0, 1.0, 255.0);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketALLATORIxDEMOxURLConnection);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketG);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Socketa);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.Sockete);
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(RenderWorldLastEvent a) {
        FACKCRACKMEAAAl a2;
        if (a2.Sockete.field_71474_y.field_74336_f) {
            a2.Sockete.field_71474_y.field_74336_f = false;
        }
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glPushMatrix();
        GL11.glTranslated((double)(-TileEntityRendererDispatcher.field_147554_b), (double)(-TileEntityRendererDispatcher.field_147555_c), (double)(-TileEntityRendererDispatcher.field_147552_d));
        double d = a.getPartialTicks();
        a = a2.BufferedReaderALLATORIxDEMOxURLConnection().func_72441_c(0.0, (double)((Minecraft)a2.Sockete).field_71439_g.func_70047_e(), 0.0).func_72441_c(TileEntityRendererDispatcher.field_147554_b, TileEntityRendererDispatcher.field_147555_c, TileEntityRendererDispatcher.field_147552_d);
        GL11.glBegin((int)1);
        for (EntityPlayer entityPlayer : a2.Sockete.field_71441_e.field_73010_i) {
            if (entityPlayer == ((Minecraft)a2.Sockete).field_71439_g) continue;
            entityPlayer = entityPlayer.func_174813_aQ().func_189972_c().func_178788_d(new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v).func_178786_a(entityPlayer.field_70169_q, entityPlayer.field_70167_r, entityPlayer.field_70166_s).func_186678_a(1.0 - d)).func_178786_a(0.0, (double)(entityPlayer.field_70131_O / 2.0f), 0.0);
            if (!a2.SocketK.BufferedReaderALLATORIxDEMOxURLConnection()) {
                FACKCRACKMEAAAl.BufferedReaderALLATORIxDEMOxURLConnection(new Color((int)a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection(), (int)a2.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(), (int)a2.Socketa.BufferedReaderALLATORIxDEMOxURLConnection(), (int)a2.Sockete.BufferedReaderALLATORIxDEMOxURLConnection()));
            } else {
                Color color = FACKCRACKMEAAAh.BufferedReaderALLATORIxDEMOxURLConnection();
                FACKCRACKMEAAAl.BufferedReaderALLATORIxDEMOxURLConnection(new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)a2.Sockete.BufferedReaderALLATORIxDEMOxURLConnection()));
            }
            GL11.glVertex3d((double)a.field_72450_a, (double)a.field_72448_b, (double)a.field_72449_c);
            GL11.glVertex3d((double)entityPlayer.field_72450_a, (double)entityPlayer.field_72448_b, (double)entityPlayer.field_72449_c);
        }
        GL11.glEnd();
        GlStateManager.func_179117_G();
        GL11.glPopMatrix();
        FACKCRACKMEAAAl.BufferedReaderALLATORIxDEMOxURLConnection(new Color((int)a2.SocketALLATORIxDEMOxURLConnection.BufferedReaderALLATORIxDEMOxURLConnection(), (int)a2.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(), (int)a2.Socketa.BufferedReaderALLATORIxDEMOxURLConnection(), (int)a2.Sockete.BufferedReaderALLATORIxDEMOxURLConnection()));
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }
}

