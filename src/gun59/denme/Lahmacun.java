package gun59.denme;

public class Lahmacun implements IFood {
    int adet;

    public Lahmacun(int adet) {
        this.adet = adet;
    }

    public Lahmacun() {
    }

    @Override
    public void taste() {
        System.out.println("Sulu ve citir enfes bir tat ...");
    }

    @Override
    public double ucret() {
        return 3 * adet;
    }

    public void dough() {
        System.out.println("Hamuru en guzel sekilde acildi..");
    }

    public void addMeat() {
        System.out.println("en taze etler eklendi");
    }

    public void bake() {
        System.out.println("Uygun sekilde firinlandi...");
    }

    @Override
    public String toString() {
        return "Lahmacun{" +
                "adet=" + adet +
                '}';
    }
}
