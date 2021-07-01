package Methods.SecondDay;

import java.util.Arrays;

public class Methods_3 {
    public static void main(String[] args) {

        //todo  Double bir arrayli method oluşturunuz. Verilen Array'i hem düz hem de tersten yazdırınız.

        double[] fiyatlar = {1.95, 3.45, 5.6, 1.1};
        System.out.println("Array çıktısı: ");
        System.out.println(Arrays.toString(fiyatlar));
        arrayTers(fiyatlar);
    }


    public static void arrayTers(double[] doubleArray) {
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i] + " ");
        }

    }

}
