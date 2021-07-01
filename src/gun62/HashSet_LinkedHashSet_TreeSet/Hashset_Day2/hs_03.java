package HashSet_LinkedHashSet_TreeSet.Hashset_Day2;

import java.util.HashSet;

public class hs_03 {
    public static void main(String[] args) {


         /*
    main method altinda bir double hashSet olusturunuz.

    ve bu seti, adi setOlustur ve return tipi hashSet double olan,

    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.

    adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak

    hashSetin degerlerinin toplamini alınız.    ListOf'la da yapılabilir.
     */

        //HashSet<Double> set = new HashSet<>();
        HashSet<Double> set = setOlustur();

        double toplam = toplaminiAl(set);
//                                          -- Bu şekide de print alınabilir.
        System.out.println(toplam);

        //System.out.println(toplaminiAl(set));
        //System.out.println(set);

    }

    public static HashSet<Double> setOlustur() {

        HashSet<Double> set = new HashSet<>();

        set.add(3.23);
        set.add(3.10);
        set.add(5.12);
        set.add(10.12);
        set.add(23.12);

        return set;

    }

    public static double toplaminiAl(HashSet<Double> set) {

        double toplam = 0;
        for (Double aDouble : set) {

            toplam += aDouble;

        }
        return toplam;
    }
}
