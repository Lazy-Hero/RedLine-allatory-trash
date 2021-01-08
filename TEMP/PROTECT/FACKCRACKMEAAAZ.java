/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntityGolem
 *  net.minecraft.entity.monster.EntityPigZombie
 *  net.minecraft.entity.monster.IMob
 *  net.minecraft.entity.passive.EntityAmbientCreature
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityTameable
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAT;
import TEMP.PROTECT.FACKCRACKMEAAAp;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FACKCRACKMEAAAZ
extends FACKCRACKMEAAAH {
    public /* synthetic */ FACKCRACKMEAAAp SocketG;
    public /* synthetic */ int SocketALLATORIxDEMOxURLConnection;

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(MouseEvent a) {
        FACKCRACKMEAAAZ a2;
        if (a2.Sockete.field_71462_r != null) {
            return;
        }
        if (a2.Sockete.field_71439_g != null && a.isButtonstate() && a.getButton() == a2.SocketALLATORIxDEMOxURLConnection && (a2.Sockete.field_71476_x == null || a2.Sockete.field_71476_x.field_72308_g == null) && (a = a2.BufferedReaderALLATORIxDEMOxURLConnection(a2.Sockete.func_184121_ak(), (float)a2.SocketG.BufferedReaderALLATORIxDEMOxURLConnection(), false)) != null) {
            Iterator iterator = a2.Sockete.field_71441_e.field_73010_i.iterator();
            while (iterator.hasNext()) {
                Entity entity = (Entity)a[0];
                EntityPlayer entityPlayer = (EntityPlayer)iterator.next();
                if (entity != entityPlayer && !(entity instanceof IMob) && !(entity instanceof EntityWaterMob) && !(entity instanceof EntityPigZombie) && !(entity instanceof EntityEnderman) && !(entity instanceof EntityAnimal) && !(entity instanceof EntityAmbientCreature) && !(entity instanceof EntityVillager) && !(entity instanceof EntityGolem) && !(entity instanceof EntityTameable)) continue;
                a2.Sockete.field_71476_x = new RayTraceResult(entity, (Vec3d)a[1]);
                if (!(entity instanceof EntityLivingBase) && !(entity instanceof EntityItemFrame)) continue;
                a2.Sockete.field_147125_j = entity;
            }
        }
    }

    public /* synthetic */ FACKCRACKMEAAAZ() {
        super("Reach", 0, FACKCRACKMEAAAT.SocketK);
        FACKCRACKMEAAAZ a;
        a.SocketG = new FACKCRACKMEAAAp("Distance", 4.1, 3.0, 6.0);
        a.BufferedReaderALLATORIxDEMOxURLConnection(a.SocketG);
    }

    @Override
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection() {
        FACKCRACKMEAAAZ a;
        if (a.Sockete.field_71474_y.field_74312_F.func_151463_i() == -100) {
            a.SocketALLATORIxDEMOxURLConnection = 0;
        }
        if (a.Sockete.field_71474_y.field_74312_F.func_151463_i() == -99) {
            a.SocketALLATORIxDEMOxURLConnection = 1;
        }
    }

    private /* synthetic */ Object[] BufferedReaderALLATORIxDEMOxURLConnection(float a5, double a2, boolean a3) {
        FACKCRACKMEAAAZ a4;
        Entity entity = null;
        Vec3d vec3d = null;
        if (a4.Sockete.func_175606_aa() != null && a4.Sockete.field_71441_e != null) {
            Vec3d vec3d2 = a4.Sockete.func_175606_aa().func_174824_e(a5);
            Object a5 = a4.Sockete.func_175606_aa().func_70676_i(a5);
            Vec3d vec3d3 = vec3d2.func_72441_c(((Vec3d)a5).field_72450_a * a2, ((Vec3d)a5).field_72448_b * a2, ((Vec3d)a5).field_72449_c * a2);
            double d = 1.0;
            a5 = a4.Sockete.field_71441_e.func_72839_b(a4.Sockete.func_175606_aa(), a4.Sockete.func_175606_aa().func_184177_bl().func_72321_a(((Vec3d)a5).field_72450_a * a2, ((Vec3d)a5).field_72448_b * a2, ((Vec3d)a5).field_72449_c * a2).func_72321_a(1.0, 1.0, 1.0));
            a2 = Double.MAX_VALUE;
            for (int i = 0; i < a5.size(); ++i) {
                Entity entity2 = (Entity)a5.get(i);
                if (!entity2.func_70067_L()) continue;
                d = entity2.func_70111_Y();
                RayTraceResult rayTraceResult = entity2.func_184177_bl().func_72321_a(d, d, d).func_72327_a(vec3d2, vec3d3);
                if (rayTraceResult == null || !(a2 > (d = vec3d2.func_72438_d(rayTraceResult.field_72307_f)))) continue;
                a2 = d;
                entity = entity2;
                vec3d = rayTraceResult.field_72307_f;
            }
            return new Object[]{entity, vec3d};
        }
        return null;
    }
}

