/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.Session
 *  net.minecraft.util.Timer
 */
package TEMP.PROTECT;

import java.lang.reflect.Field;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;

public class FACKCRACKMEAAAe {
    public static /* synthetic */ void BufferedReaderj(int a) {
        PlayerControllerMP playerControllerMP = Minecraft.func_71410_x().field_71442_b;
        try {
            Field field = PlayerControllerMP.class.getDeclaredFields()[6];
            field.setAccessible(true);
            field.setInt((Object)playerControllerMP, a);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ float BufferedReaderALLATORIxDEMOxURLConnection() {
        try {
            Field field = FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection().getClass().getDeclaredField("tickLength");
            field.setAccessible(true);
            float f = field.getFloat((Object)FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection());
            return f;
        }
        catch (Exception exception) {
            try {
                Field field = FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection().getClass().getDeclaredField("field_194149_e");
                field.setAccessible(true);
                float f = field.getFloat((Object)FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection());
                return f;
            }
            catch (Exception exception2) {
                return 0.0f;
            }
        }
    }

    public static /* synthetic */ void BufferedReaderj(boolean a) {
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        try {
            Field field = Entity.class.getDeclaredFields()[31];
            field.setAccessible(true);
            field.setBoolean((Object)entityPlayerSP, a);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(String a) {
        Minecraft minecraft = Minecraft.func_71410_x();
        try {
            Field field = Minecraft.class.getDeclaredField("session");
            field.setAccessible(true);
            minecraft = (Session)field.get((Object)minecraft);
            Field field2 = Session.class.getDeclaredField("username");
            field2.setAccessible(true);
            field2.set((Object)minecraft, new String(a));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(boolean a) {
        GameSettings gameSettings = Minecraft.func_71410_x().field_71474_y;
        try {
            Field field = GameSettings.class.getDeclaredField("ofFastRender");
            field.setAccessible(true);
            field.setBoolean((Object)gameSettings, false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(int a) {
        try {
            Field field = Minecraft.class.getDeclaredField("rightClickDelayTimer");
            field.setAccessible(true);
            field.set((Object)Minecraft.func_71410_x(), a);
            return;
        }
        catch (Exception exception) {
            try {
                Field field = Minecraft.class.getDeclaredField("field_71467_ac");
                field.setAccessible(true);
                field.set((Object)Minecraft.func_71410_x(), a);
                return;
            }
            catch (Exception exception2) {
                return;
            }
        }
    }

    public static /* synthetic */ void BufferedReaderj(float a) {
        PlayerControllerMP playerControllerMP = Minecraft.func_71410_x().field_71442_b;
        try {
            Field field = PlayerControllerMP.class.getDeclaredFields()[4];
            field.setAccessible(true);
            field.setFloat((Object)playerControllerMP, a);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection() {
        EntityRenderer entityRenderer = Minecraft.func_71410_x().field_71460_t;
        try {
            Field field = EntityRenderer.class.getDeclaredFields()[56];
            field.setAccessible(true);
            field.set((Object)entityRenderer, null);
            return;
        }
        catch (Exception exception) {
            System.out.println(exception.toString());
            return;
        }
    }

    public static /* synthetic */ Timer BufferedReaderALLATORIxDEMOxURLConnection() {
        try {
            Class<Minecraft> class_ = Minecraft.class;
            Field field = class_.getDeclaredField("timer");
            field.setAccessible(true);
            return (Timer)field.get((Object)Minecraft.func_71410_x());
        }
        catch (Exception exception) {
            try {
                Class<Minecraft> class_ = Minecraft.class;
                Field field = class_.getDeclaredField("field_71428_T");
                field.setAccessible(true);
                return (Timer)field.get((Object)Minecraft.func_71410_x());
            }
            catch (Exception exception2) {
                return null;
            }
        }
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(KeyBinding a, boolean a2) {
        try {
            Field field = KeyBinding.class.getDeclaredField("pressed");
            field.setAccessible(true);
            field.setBoolean((Object)a, a2);
            return;
        }
        catch (Exception exception) {
            try {
                Field field = null;
                try {
                    field = KeyBinding.class.getDeclaredField("field_146155_p");
                }
                catch (Exception exception2) {
                    field = KeyBinding.class.getDeclaredField("field_74513_e");
                }
                field.setAccessible(true);
                field.setBoolean((Object)a, a2);
                return;
            }
            catch (Exception exception3) {
                return;
            }
        }
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(float a, Timer a2) {
        try {
            Field field = a2.getClass().getDeclaredField("tickLength");
            field.setAccessible(true);
            field.setFloat((Object)a2, 1000.0f / a);
            return;
        }
        catch (Exception exception) {
            try {
                Field field = a2.getClass().getDeclaredField("field_194149_e");
                field.setAccessible(true);
                field.setFloat((Object)a2, 1000.0f / a);
                return;
            }
            catch (Exception exception2) {
                return;
            }
        }
    }

    public /* synthetic */ FACKCRACKMEAAAe() {
        FACKCRACKMEAAAe a;
    }

    public static /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(float a) {
        FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection(a * 20.0f, FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection());
    }

    public static /* synthetic */ boolean BufferedReaderALLATORIxDEMOxURLConnection() {
        GameSettings gameSettings = Minecraft.func_71410_x().field_71474_y;
        boolean bl = false;
        try {
            Field field = GameSettings.class.getDeclaredField("ofFastRender");
            field.setAccessible(true);
            bl = field.getBoolean((Object)gameSettings);
            return bl;
        }
        catch (Exception exception) {
            return bl;
        }
    }
}

