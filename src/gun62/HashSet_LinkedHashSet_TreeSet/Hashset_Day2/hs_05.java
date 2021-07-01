package HashSet_LinkedHashSet_TreeSet.Hashset_Day2;

import java.util.Arrays;
import java.util.HashSet;

public class hs_05 {
    //todo Main methodun içimde İki adet set oluşturun. Bu setlerin içinde isimler tekrar etsin.
    // Set1 -> "Mehmet", "Ahmet", "Ayşe", "Hüseyin", "Murat"
    // Set2 -> "Caner", "Ahmet", "Elif", "Hüseyin", "Murat", "Esra"
    // Main methodun dışında bir method'da bu iki set'de toplam kaç kişi olduğunu hesaplayın.

    public static void main(String[] args) {
        HashSet<String> developers = new HashSet<>(Arrays.asList("Mehmet", "Ahmet", "Ayşe", "Hüseyin", "Murat"));
        HashSet<String> testers = new HashSet<>(Arrays.asList("Caner", "Ahmet", "Elif", "Hüseyin", "Murat", "Esra"));

        int toplam = toplamKisiSayisi(developers, testers);
        System.out.println(toplam);
    }

    public static int toplamKisiSayisi(HashSet<String> team1, HashSet<String> team2) {
        HashSet<String> total = new HashSet<>(team1);
        total.addAll(team2);

        return total.size();
    }
}
