package gun52.soru2;

public class Main {
    public static void main(String[] args) {
        Okul okul1 = new Okul("Koray lisesi", 150);
        Okul okul2 = new Okul("Cumhuriyet Lisesi", 200);

        Ogrenci ogr1 = new Ogrenci("Arif komis", "Manisa merkez", okul1, 2000);
        Ogrenci ogr2 = new Ogrenci("Ulku", "Soma merkez", okul1, 1900);

        Calisan calisan1 = new Calisan("Ali", "Istanbul merkez", okul1, 4000);
        Calisan calisan2 = new Calisan("veli", "Ankara merkez", okul1, 3900);

        okul1.ogrenciKayit(ogr1);
        okul1.ogrenciKayit(ogr2);

        okul1.calisanEkle(calisan1);
        okul1.calisanEkle(calisan2);

        okul1.ogrenciListele();
        okul1.calisanListele();


    }
}
