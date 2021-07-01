package gun57.Ornek2;

public class Dikdortgen extends Sekil {
    private final double uzunluk;
    private final double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }


    @Override
    double alan() {
        return uzunluk * genislik;
    }

    @Override
    double cevre() {
        return (uzunluk + genislik) * 2;
    }
}
