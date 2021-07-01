package gun44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_MultipleCatch {
    // Kullanıcıdan 5 kez 2 şer adet sayı alınız ve bölüm sonucunu ekranda gösteriniz.
    // Oluşabilecek tüm hataları try-catch ile handle ediniz.
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            try {
                Scanner oku = new Scanner(System.in);

                System.out.print("1.sayiyi giriniz= ");
                int s1 = oku.nextInt();
                System.out.print("2.sayiyi giriniz= ");
                int s2 = oku.nextInt();
                System.out.println("Bolum= " + s1 / s2);

            } catch (ArithmeticException ex) {
                System.out.println("******Please********");
                System.out.println("Lutfen ikinci sayiya 0 girmeyiniz");
                i--;
            } catch (InputMismatchException ex) {
                System.out.println("******Please********");
                System.out.println("Lutfen sayi giriniz");
                i--;
            }


        }

    }


}
