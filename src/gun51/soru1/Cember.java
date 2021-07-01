package gun51.soru1;

public class Cember extends Sekil {
    private final double yariCap;

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double getCevre() {
        return 2 * Math.PI * yariCap;
    }


    @Override
    public String toString() {
        return "YariCap= " + yariCap +
                "Cevresi= " + getCevre();
    }


}
