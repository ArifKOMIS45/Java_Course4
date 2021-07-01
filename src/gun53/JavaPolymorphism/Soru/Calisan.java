package gun53.JavaPolymorphism.Soru;

public class Calisan extends Kisi {
    private String departman;

    public Calisan(String ad, String soyad, String gorev, String departman) {
        super(ad, soyad, gorev);
        this.departman = departman;
    }

    @Override
    public String toString() {
        return super.toString() + " Departmani: " + departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
