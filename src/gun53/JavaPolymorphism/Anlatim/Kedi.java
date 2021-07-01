package gun53.JavaPolymorphism.Anlatim;

public class Kedi extends Hayvan {
    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Miyavladi...");
    }
}
