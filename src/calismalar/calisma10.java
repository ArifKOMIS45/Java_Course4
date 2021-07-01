package calismalar;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calisma10 {
    static Pattern ptn =
            Pattern.compile("(\\w+)@(\\w+)\\.(\\w+)");

    public static List<String> captureValues(String largeText) {
        Matcher mtch = ptn.matcher(largeText);
        List<String> ips = new ArrayList<String>();
        while (mtch.find()) {
            ips.add(mtch.group());
        }
        return ips;
    }

    public static void main(String[] a) {
        String str = "Hi my machine IP is 10.20.30.40 and i would like " +
                "to access port 80 from the host 23.12.56.34, which internally" +
                "connects to 3.90.23.65. Please process the request" +
                "Arif komis arifkomis@gmail.com 988747 nasilsin ";
//       System.out.println(captureValues(str));
        Matcher mtch = ptn.matcher(str);
        List<String> ips = new ArrayList<String>();
        while (mtch.find()) {
            ips.add(mtch.group());
        }
        System.out.println("ips = " + ips);
    }

}

