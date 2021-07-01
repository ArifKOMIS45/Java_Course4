package HashSet_LinkedHashSet_TreeSet.Hashset_Day2;

import java.util.HashSet;

public class hs_04 {
    public static void main(String[] args) {


/*todo        main method altinda bos bir hashset olusturunuz.
                parametresi Integer set ve integer array ve adi elementEkle olan bir method yaziniz (return tipi olmayacak)
                    yine set icindekileri yazdiracak ayrica bir print isminde bir metod daha yaziniz.

*/
        HashSet<Integer> set = new HashSet<>();     //todo (1)

//        int[] arr = {10, 27, 3, 40, 57, 6, 7, 8, 9, 10};
//
//        elementEkle(set,arr);

        elementEkle(set, new int[]{10, 27, 3, 40, 57, 6, 7, 8, 9, 10});  //todo (4)
        print(set);

    }

    public static void elementEkle(HashSet<Integer> set, int[] elements) {  //todo (2)

        for (int element : elements) {

            set.add(element);

        }

    }

    public static void print(HashSet<Integer> set) {     //todo (3)
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
