package gun52.soru1;

public class Okul {
    public static void main(String[] args) {
        IlkOgrencisi ogr1 = new IlkOgrencisi("Arif", "ilkokul");
        IlkOgrencisi ogr = new IlkOgrencisi("Saliha", "ilkokul");

        LiseOgrencisi liseOgrencisi1 = new LiseOgrencisi("Beyza", "Lise");
        LiseOgrencisi liseOgrencisi2 = new LiseOgrencisi("Azra", "Lise");

        System.out.println("ogr = " + ogr);
        System.out.println("ogr1 = " + ogr1);
        System.out.println("liseOgrencisi1 = " + liseOgrencisi1);
        System.out.println("liseOgrencisi2 = " + liseOgrencisi2);


    }
}
