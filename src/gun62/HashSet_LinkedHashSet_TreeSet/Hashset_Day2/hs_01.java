package HashSet_LinkedHashSet_TreeSet.Hashset_Day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hs_01 {
    public static void main(String[] args) {

        //todo      Hashset, TreeSet ve LinkedHashSet oluşturunuz ve elemanlarını yazdırınız.
        //              [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]


        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6));

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6)); //or hashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6)); // or hashSet

        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);

    }
}
