package SingleDarrays_foreach_split;

import java.util.Scanner;

public class SingleD_4 {
    public static void main(String[] args) {

        //TODO    Scanner ile Array elemanlarını girme

        Scanner sc = new Scanner(System.in);

        int[] Elma = new int[4];
        int toplam = 0;

        //Array'in değerlerini girme
        System.out.println("Arrayin elemanlarını giriniz: ");

        for (int i = 0; i < Elma.length; i++) {
            Elma[i] = sc.nextInt();
        }

        //Arrayin değerlerini yazdırma
        System.out.println("Arrayin değerleri yadırılıyor...");
        for (int i = 0; i < Elma.length; i++) {
            System.out.println("Eleman: " + Elma[i]);
        }

        //Arrayin elemanlarının ortalaması
        for (int i = 0; i < Elma.length; i++) {
            toplam = toplam + Elma[i];
        }

        int ortalama = toplam / Elma.length;
        System.out.println("Arrayin elemanlarının Ortalaması: " + ortalama);

    }
}
