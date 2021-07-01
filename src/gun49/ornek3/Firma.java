package gun49.ornek3;

public class Firma {
    public static void main(String[] args) {
        Calisan calisan = new Calisan("mesut", 2500, 2);
        System.out.println("butun bilgiler = " + calisan.toString());
        System.out.println("maas = " + calisan.maasHesapla());

        GenekMudur gm = new GenekMudur("Ragip", 4000, 2, 1000);
        System.out.println("butun bilgiler = " + gm.toString());
        System.out.println("maas = " + gm.maasHesapla());


    }
}
