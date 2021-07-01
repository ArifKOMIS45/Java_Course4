package gun51.soru1;

public class Dikdortgen extends Sekil {
    private final double genislik;
    private final double uzunluk;

    public Dikdortgen(double genislik, double uzunluk) {
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }

    @Override
    public double getAlan() {
        return uzunluk * genislik;
    }

    @Override
    public double getCevre() {
        return uzunluk * 2 + genislik * 2;
    }

    @Override
    public String toString() {
        return "Alan=" + getAlan() +
                ", Cevre=" + getCevre()
                ;
    }
}
