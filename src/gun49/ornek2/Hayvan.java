package gun49.ornek2;

public class Hayvan {
    private String renk;
    private int kilo;
    private String cinsi;

    public Hayvan(String renk, int kilo, String cinsi) {
        this.setRenk(renk);
        this.setKilo(kilo);
        this.setCinsi(cinsi);
    }

    public void konustu() {
        System.out.println("Hayvan konustu...");
    }

    public void yemekYedi() {
        System.out.println("yemek yedi....");
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
}
