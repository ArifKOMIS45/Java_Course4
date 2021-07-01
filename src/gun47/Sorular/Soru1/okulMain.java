package gun47.Sorular.Soru1;

import java.util.Scanner;

public class okulMain {
    public static void main(String[] args) {
        Okul school = new Okul("Cumhuriyet", 3);

        Scanner Scan = new Scanner(System.in);
        Scanner Scanint = new Scanner(System.in);


        int ogrenciSayisi = 1;
        do {
            System.out.print(ogrenciSayisi + ". Ogrenci adi=");
            String ogrAd = Scan.nextLine();

            System.out.print(ogrenciSayisi + ". Ogrenci soyadi=");
            String ogrsoyad = Scan.nextLine();

            System.out.print(ogrenciSayisi + ". yasi=");
            int ogrYas = Scanint.nextInt();
            try {
                Ogrenci ogr = new Ogrenci(ogrAd, ogrsoyad, ogrYas);
                school.getOgrenciList().add(ogr);
                ogrenciSayisi++;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.println("Lutfen yeniden giriniz");
            }

        } while (ogrenciSayisi <= school.getMaxOgrenciSayisi());

        school.getOgrenciList().forEach(System.out::println);


    }


}
