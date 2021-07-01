package gun59.denme;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        ArrayList<IFood> siparis = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int secim = 0;
        do {
            menu();
            System.out.print("Seciminiz= ");
            secim = scan.nextInt();

            switch (secim) {
                case 1 -> {
                    System.out.print("Kac porsiyon= ");
                    int adet = scan.nextInt();
                    AdanaKebab ak = new AdanaKebab(adet);
                    siparis.add(ak);
                }
                case 2 -> {
                    System.out.print("Kac porsiyon= ");
                    int adet = scan.nextInt();
                    Lahmacun l = new Lahmacun(adet);
                    siparis.add(l);
                }
                case 3 -> {
                    System.out.print("Kac porsiyon= ");
                    int adet = scan.nextInt();
                    Borsh b = new Borsh(adet);
                    siparis.add(b);
                }
                case 4 -> {
                    System.out.print("Kac porsiyon= ");
                    int adet = scan.nextInt();
                    Palov p = new Palov(adet);
                    siparis.add(p);
                }

            }
            System.out.println("---------------------------------------");
        } while (secim != 0 && secim < 5);
        System.out.println("****************************************88");
        System.out.println("Alinan siparisler..");
        siparis.forEach(System.out::println);

        int toplam = 0;
        for (IFood f : siparis) {
            TecnoKitchen.Hazirla(f);
            toplam += f.ucret();
        }
        System.out.println("----------------------------");
        System.out.println("Toplam ucret= " + toplam);


    }

    public static void menu() {
        System.out.println("****Menü***** \n" +
                "1-Adana Kebap (5 TL) \n" +
                "2-Lahmacun (3 TL) \n" +
                "3-Borsh (3 TL) \n" +
                "4-Palov (4 TL) \n" +
                "5-Tamam");
    }

}
