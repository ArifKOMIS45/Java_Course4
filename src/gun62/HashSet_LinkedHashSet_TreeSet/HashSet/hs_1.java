package HashSet_LinkedHashSet_TreeSet.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hs_1 {
    public static void main(String[] args) {


        /*
        Hashset bir kümedir, Hashmap bir işaretlemedir.

        HashSet (Küme)

        -Değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)

        -Aynı değerlerin birden fazlasına izin vermez.

        -Sadece bir null değer alabilir. (TreeSet)


        LinkedHashSet                       TreeSet
        -Giriş sırasına dikkat eder.        Alfabetik ya da kücükten büyüğe

         */

        /*
        Arraylerle bunun farkları
        1- Arraylerde aynı eleman birden fazla olabilir.
                Bunda olamaz.
        2- Array'deki elemanlara index ile ulaşabiliriz.
                Bunda ulaşamayız.
         */
        HashSet<String> set = new HashSet<>();

        set.add("Kartal");
        set.add("Yılan");
        set.add("Tavşan");
        set.add("Çekirge");
        set.add("Yaprak");
        set.add("Yaprak");

        System.out.println("Set ------------->" + set);
        System.out.println("-----------------------------------------------");

        TreeSet<String> treeSet = new TreeSet<>();
        //Alfabetik sıraya göre yazdıracak
        treeSet.add("Kartal");
        treeSet.add("Yılan");
        treeSet.add("Tavşan");
        treeSet.add("Çekirge");
        treeSet.add("Yaprak");
        treeSet.add("Yaprak");

        System.out.println("TreeSet ---------------->" + treeSet);
        System.out.println("-----------------------------------------------");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        // Giriş sırasına göre yazdıracak
        linkedHashSet.add("Kartal");
        linkedHashSet.add("Yılan");
        linkedHashSet.add("Tavşan");
        linkedHashSet.add("Çekirge");
        linkedHashSet.add("Yaprak");
        linkedHashSet.add("Yaprak");

        System.out.println("LinkedSet ---------------->" + linkedHashSet);


    }
}
