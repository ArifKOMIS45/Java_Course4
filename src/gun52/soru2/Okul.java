package gun52.soru2;

import java.util.ArrayList;

public class Okul {
    private final ArrayList<Calisan> calisanlar = new ArrayList<>();
    private final ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
    private String ismi;
    private int maxOgrenciSayisi;

    public Okul(String ismi, int maxOgrenciSayisi) {
        this.ismi = ismi;
        this.maxOgrenciSayisi = maxOgrenciSayisi;


    }

    public void ogrenciKayit(Ogrenci ogr) {
        ogrenciler.add(ogr);

    }

    public void calisanEkle(Calisan calisan) {
        calisanlar.add(calisan);
    }

    public void ogrenciListele() {
        ogrenciler.forEach(System.out::println);
    }

    public void calisanListele() {
        calisanlar.forEach(System.out::println);
    }


    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    @Override
    public String toString() {
        return
                ismi + '\''
                ;
    }
}
