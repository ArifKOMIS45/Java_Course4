package gun49.ornek2;

public class Kopek extends Hayvan {

    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Kopek hav hav dedi...");
    }
}
