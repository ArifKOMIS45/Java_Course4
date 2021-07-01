package gun53.JavaPolymorphism.Soru;


public class Main {
    public static void main(String[] args) {
        Kisi ogr = new Ogrenci("arif", "komis", "baskan", "8A");
        Kisi calisan = new Calisan("Abuzer", "Yilmaz", "Mudur yardimcisi", "yoneticisi");

        Kisi.kimlikYaz(ogr);
        Kisi.kimlikYaz(calisan);


        Kisi.kimlikYaz2(ogr);
        Kisi.kimlikYaz2(calisan);


    }

}

