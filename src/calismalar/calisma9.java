package calismalar;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calisma9 {
    public static void main(String[] args) {
        String str = "Nasilsin ulku hanim iyimisin how are you azra@hotmail.com " +
                "adresindan beyza@gamil.com adresine bir " +
                "seyler yollarken inume arifkomis@gmail.com geldi";

        Pattern ptn = Pattern.compile("(\\w+)@(\\w+)\\.(\\w+)");
        Matcher matcher = ptn.matcher(str);
        List<String> a = new ArrayList<>();
        while (matcher.find()) {
            a.add(matcher.group());
        }
        a.forEach(System.out::println);

    }
}
