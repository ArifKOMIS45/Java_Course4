package Odevler.interface2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);
        ArrayList<String> listNumbers = new ArrayList<>();
        int counter = 0;
        while (dp.hasNext()) {
            System.out.print("Aldiginiz urunun fiyatinin girin= ");
            String urun = dp.nextLine();
            listNumbers.add(urun);
            counter++;
            if (counter == 10) {
                break;
            }
        }

        Amazon musteri1 = new Amazon();
        musteri1.isFreeShipping(listNumbers);

        Costco musteri2 = new Costco();
        musteri2.isFreeShipping(listNumbers);
    }
}
