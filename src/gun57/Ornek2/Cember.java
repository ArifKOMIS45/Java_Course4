package gun57.Ornek2;

public class Cember extends Sekil {
    private final double yariCap;

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }


    @Override
    double alan() {
        return Math.PI * yariCap * yariCap;
    }

    @Override
    double cevre() {
        return 2 * Math.PI * yariCap;
    }
}
