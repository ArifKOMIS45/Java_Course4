package gun59.denme;

public class AdanaKebab implements IFood {
    int adet;

    public AdanaKebab(int adet) {
        this.adet = adet;
    }

    public AdanaKebab() {
    }

    @Override
    public void taste() {
        System.out.println("Cok lezzetli ve guzel...");
    }

    @Override
    public double ucret() {
        return 5 * adet;
    }

    public void marinade() {
        System.out.println("En guzel sekilde marine edildi...");
    }

    public void grill() {
        System.out.println("Uygun sicaklikta kizartildi...");
    }

    @Override
    public String toString() {
        return "AdanaKebab{" +
                "adet=" + adet +
                '}';
    }
}
