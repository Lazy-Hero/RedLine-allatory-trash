/*
 * Decompiled with CFR 0.150.
 */
package TEMP.PROTECT;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Enumeration;

public class FACKCRACKMEAAAQ {
    public /* synthetic */ FACKCRACKMEAAAQ() {
        FACKCRACKMEAAAQ a;
    }

    public static /* synthetic */ String BufferedReaderALLATORIxDEMOxURLConnection(String a) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            byte[] arrby = messageDigest.digest(a.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < arrby.length; ++i) {
                stringBuffer.append(Integer.toHexString(arrby[i] & 0xFF | 0x100).substring(1, 3));
            }
            return stringBuffer.toString();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
    }

    private static /* synthetic */ NetworkInterface BufferedReaderALLATORIxDEMOxURLConnection() throws Exception {
        NetworkInterface networkInterface = null;
        Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
        while (enumeration.hasMoreElements()) {
            NetworkInterface networkInterface2 = enumeration.nextElement();
            Enumeration<InetAddress> enumeration2 = networkInterface2.getInetAddresses();
            while (enumeration2.hasMoreElements() && networkInterface2.getHardwareAddress() != null && !FACKCRACKMEAAAQ.BufferedReaderALLATORIxDEMOxURLConnection(networkInterface2.getHardwareAddress())) {
                InetAddress inetAddress = enumeration2.nextElement();
                if (!(inetAddress instanceof Inet4Address) || !inetAddress.isSiteLocalAddress()) continue;
                networkInterface = NetworkInterface.getByInetAddress(inetAddress);
            }
        }
        return networkInterface;
    }

    public /* synthetic */ String BufferedReaderALLATORIxDEMOxURLConnection() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.getProperty("os.name"));
        stringBuilder.append(new String(Base64.getEncoder().encode(FACKCRACKMEAAAQ.BufferedReaderALLATORIxDEMOxURLConnection().getHardwareAddress())));
        return FACKCRACKMEAAAQ.BufferedReaderALLATORIxDEMOxURLConnection(stringBuilder.toString());
    }

    private static /* synthetic */ boolean BufferedReaderALLATORIxDEMOxURLConnection(byte[] a) {
        if (null == a) {
            return false;
        }
        for (byte[] arrby : new byte[][]{{0, 5, 105}, {0, 28, 20}, {0, 12, 41}, {0, 80, 86}, {8, 0, 39}, {10, 0, 39}, {0, 3, -1}, {0, 21, 93}}) {
            if (arrby[0] != a[0] || arrby[1] != a[1] || arrby[2] != a[2]) continue;
            return true;
        }
        return false;
    }
}

