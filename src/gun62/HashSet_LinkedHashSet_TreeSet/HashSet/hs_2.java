package HashSet_LinkedHashSet_TreeSet.HashSet;


import java.util.HashSet;


public class hs_2 {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        // int yazamıyoruz. Primitiv type kabul etmiyor.

        hs.add(12);
//        hs.add("12");
//        hs.add(true);

        System.out.println(hs);

        HashSet hs2 = new HashSet();

        hs2.add("25");
        hs2.add(25);
        hs2.add(true);
        hs2.add(25.5);

        System.out.println(hs2);


    }
}
