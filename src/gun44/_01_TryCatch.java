package gun44;

import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        try {
            System.out.print("1.sayi giriniz= ");
            int sayi1 = oku.nextInt();

            System.out.print("2.sayi giriniz= ");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
        } catch (Exception ex)//Hata oldugunda calisacak bolum
        {
            System.out.println("Hata oldu");
            System.out.println("Hata mesaji" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
