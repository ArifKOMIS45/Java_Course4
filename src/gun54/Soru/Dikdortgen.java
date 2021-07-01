package gun54.Soru;


public class Dikdortgen implements IGenel {
    @Override
    public double Alan(int... dizi) {
        if (dizi.length == 1)
            return dizi[0] * dizi[0];
        else
            return dizi[0] * dizi[1];

    }

    @Override
    public double Cevre(int... dizi) {
        if (dizi.length == 1)
            return (dizi[0] + dizi[0]) * 2;
        else
            return (dizi[0] + dizi[1]) * 2;


    }
}
