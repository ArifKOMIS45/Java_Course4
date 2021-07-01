package HashSet_LinkedHashSet_TreeSet.HashSet;

import java.util.HashSet;

public class hs_4 {
    public static void main(String[] args) {

        //todo      Remove

        HashSet<String> hs = new HashSet<>();

        hs.add("Mor");
        hs.add("Kırmızı");
        hs.add("Yeşil");
        hs.add("Mavi");

        System.out.println(hs);
        System.out.println("-----------------------------------------");

        if (hs.remove("Mor")) {
            System.out.println("Silindi");
        } else System.out.println("Böyle bir veri yok.");

        System.out.println("------------------------------------------");
        System.out.println(hs);
    }

}
