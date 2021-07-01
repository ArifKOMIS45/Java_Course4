package gun53.JavaPolymorphism.Anlatim;

public class Kopek extends Hayvan {
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Havladi...");
    }
}
