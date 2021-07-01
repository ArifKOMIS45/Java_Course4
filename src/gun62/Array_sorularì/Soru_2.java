package Array_soruları;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {

        //todo      Scanner ile yazdığınız 3 notun(Double) ortalamasını hesaplatın.

        Scanner sc = new Scanner(System.in);

        double[] notlar = new double[3];
        double toplam = 0;

        //Arrayin değerlerini girme
        System.out.println("Notları giriniz: ");
        for (int i = 0; i < notlar.length; i++) {
            notlar[i] = sc.nextDouble();
        }
        //Ortalama alma
        for (int i = 0; i < notlar.length; i++) {
            toplam = toplam + notlar[i];
        }

        double ortalama = toplam / notlar.length;
        System.out.println("Notların Ortalaması: " + ortalama);


    }
}
