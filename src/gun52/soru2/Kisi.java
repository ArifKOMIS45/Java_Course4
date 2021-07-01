package gun52.soru2;

public class Kisi {
    private UyelikTipi uyelikTipi;
    private String isim;
    private String adres;
    private Okul okul;


    public Kisi(String isim, String adres, Okul okul, UyelikTipi uyelikTipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setUyelikTipi(uyelikTipi);


    }

    public UyelikTipi getUyelikTipi() {
        return uyelikTipi;
    }

    public void setUyelikTipi(UyelikTipi uyelikTipi) {
        this.uyelikTipi = uyelikTipi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "uyelikTipi=" + uyelikTipi +
                ", isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul=" + okul +
                '}';
    }


}
