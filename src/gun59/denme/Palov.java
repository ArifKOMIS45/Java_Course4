package gun59.denme;

public class Palov implements IFood {
    int adet;

    public Palov(int adet) {
        this.adet = adet;
    }

    public Palov() {
    }

    @Override
    public void taste() {
        System.out.println("cok lezzetli kivaminda bir pilav..");
    }

    @Override
    public double ucret() {
        return 4 * adet;
    }

    public void fry() {
        System.out.println("Tavada hafifce sehriye ile kavruluyor...");
    }

    public void boil() {
        System.out.println("20 dakika kisik ateste kaynatiliyor..");
    }

    @Override
    public String toString() {
        return "Palov{" +
                "adet=" + adet +
                '}';
    }
}
