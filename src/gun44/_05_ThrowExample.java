package gun44;

import java.util.Scanner;

public class _05_ThrowExample {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kullanici adi giriniz:");
        String userName = oku.nextLine();

        try {
            if (userName.length() < 6)
                throw new Exception("Kullanici adi 6 harften az olamaz");
            // throw ile kendimiz hata oluşturuyoruz.
            // böylece kritelerimize girmeyenler için de
            // catch bloğunua düşürerek, paratik kullanım sağlıyoruz.
            // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
            // break gibi programın devamının çalışmasını engelliyoruz.

            if (userName.length() > 10)
                throw new Exception("Kullanici adi 10 harften fazla olamaz");
        } catch (Exception ex) {
            System.out.println("Hata= " + ex.getMessage());
            //log tutuluyor
            //kimler bu hatali girisleri yapmis
        }


    }
}
