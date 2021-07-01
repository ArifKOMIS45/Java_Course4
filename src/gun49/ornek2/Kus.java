package gun49.ornek2;

public class Kus extends Hayvan {
    public Kus(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Kus cik cik dedi...");
    }
}
