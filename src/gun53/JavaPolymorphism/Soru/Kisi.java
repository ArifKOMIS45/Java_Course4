package gun53.JavaPolymorphism.Soru;

public class Kisi {
    private final String ad;
    private final String soyad;
    private final String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;
    }

    public static void kimlikYaz(Kisi kisi) {
        String s = kisi.toString();
        System.out.println(s);
    }

    public static void kimlikYaz2(Kisi kisi) {
        System.out.println();
        System.out.print("Adi = " + kisi.ad);
        System.out.print(" ,Soyadi = " + kisi.soyad);
        System.out.print(" ,Gorevi = " + kisi.gorev);
        if (kisi instanceof Ogrenci) {
            System.out.print(" ,Subesi= " + ((Ogrenci) kisi).getSubesi());
        }
        if (kisi instanceof Calisan) {
            System.out.print("Departmani= " + ((Calisan) kisi).getDepartman());
        }


    }


    @Override
    public String toString() {
        return "ad= " + ad +
                ", soyad= " + soyad +
                ", gorev= " + gorev
                ;
    }
}
