package Gun59;

public class Borsh implements IFood {
    @Override
    public void taste() {
        System.out.println("Sıcak sebze çorbası");
    }

    @Override
    public double ucret() {
        return 3;
    }

    public void boil() {
        System.out.println("Kısık ateşte kaynatılıyor..");
    }

    public void eatTomarrow() {
        System.out.println("Bir gün dinlendirilmiş olarak servis ediliyor.");
    }
}
