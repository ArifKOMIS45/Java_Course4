package gun53.JavaPolymorphism.Soru;

public class Ogrenci extends Kisi {
    private String subesi;


    public Ogrenci(String ad, String soyad, String gorev, String subesi) {
        super(ad, soyad, gorev);
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return super.toString() + " Subesi: " + subesi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }
}
