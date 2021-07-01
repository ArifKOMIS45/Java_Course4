package gun47.Sorular.Soru1;

public class Ogrenci {
    private static int ID = 1;
    private int okulno;
    private String ad;
    private String soyad;
    private int yas;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, int yas) throws Exception {
        setOkulno();
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }


    public void setYas(int yas) throws Exception {
        if (yas <= 15)
            this.yas = yas;
        else throw new Exception("Yas siniri 15");

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulno=" + okulno +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }

    public int getOkulno() {
        return okulno;
    }

    private void setOkulno() {
        this.okulno = ID++;
    }
}
