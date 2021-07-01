package Gun59;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        ArrayList<IFood> siparisler = new ArrayList<>();
        Scanner oku = new Scanner(System.in);

        int secim = 0;

        do {
            menu();
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    AdanaKebap ak = new AdanaKebap();
                    siparisler.add(ak);
                    break;

                case 2:
                    Lahmacun l = new Lahmacun();
                    siparisler.add(l);
                    break;

                case 3:
                    Borsh b = new Borsh();
                    siparisler.add(b);
                    break;

                case 4:
                    Palov p = new Palov();
                    siparisler.add(p);
                    break;
            }
        } while (secim != 0 && secim < 5);


        System.out.println("Alınan Siparişler");
        for (IFood f : siparisler) {
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("**** Siparişler hazırlanıyor ****");
        double toplamUcret = 0;
        for (IFood f : siparisler) {
            TechnoKitchen.Hazirla(f);
            toplamUcret += f.ucret();
        }

        System.out.println("toplamUcret = " + toplamUcret);
    }

    public static void menu() {
        System.out.println("*********** Menu ************");
        System.out.println("1. Adana Kebap (5)\n2. Lahmacun (3)\n3. " +
                "Borsh (3)\n4. Palov (4)\n0. Tamam");
    }


}
