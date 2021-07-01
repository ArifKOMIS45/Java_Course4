package HashSet_LinkedHashSet_TreeSet.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class hs_6 {
    public static void main(String[] args) {

        Integer[] dizi = new Integer[]{1, 6, 8, 9, 23, 24};

        HashSet<Integer> hsInt = new HashSet<>(Arrays.asList(dizi));

        HashSet<Integer> hsInt2 = new HashSet<>(Arrays.asList(5, 7, 9, 12, 15));

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(45, 67, 12, 8, 123, 6));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(23, 45, 67, 89, 1));

        System.out.println(hsInt);
        System.out.println(hsInt2);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);


    }

}
