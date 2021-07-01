package gun63;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {

        List colors = new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2); // red silindi
        //System.out.println(colors);

        colors.add(3, "cyan");
        //colors.add("cyan"); yukarıdaki kod ile aynı

        System.out.println(colors);
    }
}
