package gun47.Sorular.Soru1;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrenciList = new ArrayList<>();

    public Okul(String okulAd, int maxOgrenciSayisi) {
        setOkulAd(okulAd);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenciList() {

        return ogrenciList;

    }

    public void setOgrenciList(ArrayList<Ogrenci> ogrenciList) {

        this.ogrenciList = ogrenciList;
    }
}

