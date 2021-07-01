package While_Do_While;

import java.util.Scanner;

public class WhileDoWhile1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen PIN kodunuzu giriniz:");
        int userPin = sc.nextInt();

        int pinCode = 5555;
        while (userPin != pinCode) { //true

            System.out.println("------- Yanlış PIN -------");
            System.out.println("Tekrar Deneyiniz");
            userPin = sc.nextInt();
        }

        System.out.println("Başarıyla giriş yapıldı");

    }
}
