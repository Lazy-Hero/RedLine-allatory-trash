/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package TEMP.PROTECT;

import TEMP.PROTECT.FACKCRACKMEAAAe;
import TEMP.PROTECT.FACKCRACKMEAAAy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FACKCRACKMEAAAR {
    public /* synthetic */ boolean SocketG;
    private static /* synthetic */ String SocketALLATORIxDEMOxURLConnection;

    @SubscribeEvent
    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection(TickEvent.ClientTickEvent a) {
        FACKCRACKMEAAAR a2;
        if (FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection()) {
            FACKCRACKMEAAAe.BufferedReaderALLATORIxDEMOxURLConnection(false);
        }
        if (a2.SocketG) {
            Minecraft.func_71410_x().func_71400_g();
            Minecraft.func_71410_x().func_71405_e();
        }
    }

    public /* synthetic */ FACKCRACKMEAAAR() {
        FACKCRACKMEAAAR a;
        MinecraftForge.EVENT_BUS.register((Object)a);
        FMLCommonHandler.instance().bus().register((Object)a);
        a.BufferedReaderALLATORIxDEMOxURLConnection();
    }

    public static /* synthetic */ {
        SocketALLATORIxDEMOxURLConnection = "sprfosedfoiqwarioq3450d0A0FN0fs6g64155FG56+SD651FG6+5saf65++D5ASF+5dG1+5+dg+15A5g156+d+S5DG1+5S+DG+5+DF5GG+15SEf+5+5G+51SF+5G+5SF+51G+5245+YHJYUIODRFG";
    }

    private /* synthetic */ String BufferedReaderALLATORIxDEMOxURLConnection(String a) throws Exception {
        String string;
        a = (HttpURLConnection)new URL((String)a).openConnection();
        ((HttpURLConnection)a).setRequestMethod("GET");
        ((URLConnection)a).setRequestProperty("User-Agent", SocketALLATORIxDEMOxURLConnection);
        ((HttpURLConnection)a).getResponseCode();
        a = new BufferedReader(new InputStreamReader(((URLConnection)a).getInputStream()));
        StringBuffer stringBuffer = new StringBuffer();
        while ((string = ((BufferedReader)a).readLine()) != null) {
            stringBuffer.append(string);
        }
        ((BufferedReader)a).close();
        return stringBuffer.toString();
    }

    public /* synthetic */ void BufferedReaderALLATORIxDEMOxURLConnection() {
        try {
            FACKCRACKMEAAAR a;
            String string = a.BufferedReaderALLATORIxDEMOxURLConnection(new StringBuilder().insert(0, "https://redline.run/action.php?hwid=").append(FACKCRACKMEAAAy.Sockete.BufferedReaderALLATORIxDEMOxURLConnection()).toString());
            if (!string.equalsIgnoreCase("5")) {
                a.SocketG = false;
                return;
            }
        }
        catch (Exception exception) {
            a.SocketG = true;
        }
    }
}

