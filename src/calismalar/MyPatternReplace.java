package calismalar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPatternReplace {

    public static void main(String[] a) {
        String str = "Arif komis arifkomis@gmail.com 988747 nasilsin ";
        MyPatternReplace mpr = new MyPatternReplace();
        System.out.println(mpr.replaceWithPattern(str, ""));
    }

    public String replaceWithPattern(String str, String replace) {

        Pattern ptn = Pattern.compile("^(\\w+)@(\\w+)\\.(\\w+)");
        Matcher mtch = ptn.matcher(str);
        return mtch.replaceAll(replace);
    }
}