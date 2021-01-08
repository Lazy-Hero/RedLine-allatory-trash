/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventHandler
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  org.lwjgl.input.Keyboard
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAG;
import TEMP.PROTECT.FACKCRACKMEAAAH;
import TEMP.PROTECT.FACKCRACKMEAAAP;
import TEMP.PROTECT.FACKCRACKMEAAAQ;
import TEMP.PROTECT.FACKCRACKMEAAAR;
import TEMP.PROTECT.FACKCRACKMEAAAY;
import TEMP.PROTECT.FACKCRACKMEAAAe;
import TEMP.PROTECT.FACKCRACKMEAAAu;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

@Mod(modid="examplemod", acceptedMinecraftVersions="[1.12.2]")
public class FACKCRACKMEAAAy {
    public /* synthetic */ Minecraft SocketH;
    public static /* synthetic */ FACKCRACKMEAAAQ Sockete;
    public static /* synthetic */ FACKCRACKMEAAAP Socketa;
    public static /* synthetic */ FACKCRACKMEAAAu SocketK;
    public static /* synthetic */ FACKCRACKMEAAAY SocketG;
    private /* synthetic */ FACKCRACKMEAAAR SocketALLATORIxDEMOxURLConnection;

    public /* synthetic */ FACKCRACKMEAAAy() {
        FACKCRACKMEAAAy a;
        a.SocketH = Minecraft.func_71410_x();
        MinecraftForge.EVENT_BUS.register((Object)a);
        FMLCommonHandler.instance().bus().register((Object)a);
    }

    public static /* synthetic */ FACKCRACKMEAAAu BufferedReaderALLATORIxDEMOxURLConnection() {
        return SocketK;
    }

    @Mod.EventHandler
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(FMLInitializationEvent a) {
        SocketG = new FACKCRACKMEAAAY();
        Sockete = new FACKCRACKMEAAAQ();
        a.SocketALLATORIxDEMOxURLConnection = new FACKCRACKMEAAAR();
        Socketa = new FACKCRACKMEAAAP();
        Socketa.BufferedReaderALLATORIxDEMOxURLConnection();
        SocketK = new FACKCRACKMEAAAu();
        ((FACKCRACKMEAAAG)FACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection(FACKCRACKMEAAAG.class)).BufferedReaderALLATORIxDEMOxURLConnection(true);
        FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection("kypiDengimne");
    }

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(InputEvent.KeyInputEvent a3) {
        FACKCRACKMEAAAy a2;
        if (a2.SocketH.field_71439_g != null && a2.SocketH.field_71441_e != null && Keyboard.getEventKeyState()) {
            try {
                int a3 = Keyboard.getEventKey();
                for (FACKCRACKMEAAAH fACKCRACKMEAAAH : Socketa.BufferedReaderALLATORIxDEMOxURLConnection()) {
                    if (fACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection() != a3) continue;
                    fACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection(!fACKCRACKMEAAAH.BufferedReaderALLATORIxDEMOxURLConnection());
                }
            }
            catch (Exception a3) {
                // empty catch block
            }
        }
    }
}

