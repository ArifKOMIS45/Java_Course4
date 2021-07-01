package Methods;

import java.util.Scanner;

public class methods_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        int sinavNotum = sc.nextInt();
        String ad = sc.next();
        okulSistemi(sinavNotum, ad);

    }

    public static void okulSistemi(int notlar, String isim) {

        if (notlar >= 85) {
            System.out.println("Helal " + isim);
        } else if (notlar >= 70) {
            System.out.println("Aferin " + isim);
        } else if (notlar >= 60) {
            System.out.println("Kötü Değil" + isim);
        } else if (notlar >= 45) {
            System.out.println("Kötü" + isim);
        } else
            System.out.println("Kaldın" + isim);

    }

}
