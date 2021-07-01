package gun54.Soru;

public class Cember implements IGenel {


    @Override
    public double Alan(int... dizi) {
        return Math.PI * 2 * dizi[0];
    }

    @Override
    public double Cevre(int... dizi) {
        return Math.PI * dizi[0] * dizi[0];
    }
}
