package gun51.soru1;

public class Sekil {
    @Override
    public String toString() {
        return "Sekil: bilgi yok";
    }

    public double getAlan() {
        throw new RuntimeException("bu  sinifin bu method bir ozelligi yoktur");
    }

    public double getCevre() {
        return 0;
    }


}
