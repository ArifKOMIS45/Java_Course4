package HashSet_LinkedHashSet_TreeSet.HashSet;

import java.util.HashSet;

public class hs_3 {
    public static void main(String[] args) {

        //todo      Clear


        HashSet<String> hs = new HashSet<>();

        hs.add("Burak");
        hs.add("Emre");
        hs.add("Meral");

        System.out.println(hs);
        System.out.println("------------------------------");

        hs.clear();

        System.out.println(hs);


    }
}
