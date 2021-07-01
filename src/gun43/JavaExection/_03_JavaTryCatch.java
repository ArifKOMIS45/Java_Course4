package gun43.JavaExection;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program basladi");
        System.out.println("*********************************************");
        try {//dene hatanin olmaolasiligi yere konur
            System.out.println("Tarih setleniyor");
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println("islem tamam");
        }//hata oldugunda programi kirma
        catch (Exception hata) {//hata isimli degiskene ataniyor
            System.out.println("hata oldu");
            System.out.println("hatanin sebebi = " + hata.getMessage());
        }


        System.out.println("*******************************************");
        System.out.println("programin bu bolumunde diger metodlar calisiyor");

        System.out.println("program sonu");


    }
}
