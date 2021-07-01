package Odevler.odevEncapsulation1;

import java.util.Scanner;

public class mainApartment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        rentApartments yeni = new rentApartments();
        try {
            System.out.print("Adinizi giriniz;");
            String name = scan.nextLine();
            System.out.print("Kac oda istiyorsunuz(oda sayilari 0,1,2,3)=");
            int roomCount = scan.nextInt();
            System.out.print("Balcon istermisiniz(true/false)=");
            boolean balconyOrNo = scan.nextBoolean();

            yeni = new rentApartments(name, roomCount, balconyOrNo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("tekrar kayit olunuz");

        }

        System.out.println();

        System.out.println("yeni = " + yeni.toString());

    }


}
