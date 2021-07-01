package gun52.soru2;

public class Ogrenci extends Kisi {
    private double ucret;

    public Ogrenci(String isim, String adres, Okul okul, double ucret) {
        super(isim, adres, okul, UyelikTipi.Ogrenci);
        setUcret(ucret);
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return super.toString() + " Okul Ucreti= " + getUcret();
    }
}

