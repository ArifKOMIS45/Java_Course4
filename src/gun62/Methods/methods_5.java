package Methods;

public class methods_5 {

    /*
        int [] arr={1,34,5,678,34,56,7,8,};
        int search=78;

        - 78 sayisi verilen arrayde var mi?
        -iki parametreli method kullanin
        - eger return tipi kullancaksaniz boolean kullanin
        */

    public static void main(String[] args) {

        int[] arr = {1, 34, 5, 678, 34, 56, 7, 8,};
        int search = 1;

        System.out.println(search(arr, search));

    }

    public static boolean search(int[] numbers, int search) {

        boolean buradaMi = false;

        for (int num : numbers) {
            if (num == search) {
                buradaMi = true;
                break;
            }
        }
        return buradaMi;
    }

}
