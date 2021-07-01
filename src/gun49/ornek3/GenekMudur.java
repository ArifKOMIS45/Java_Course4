package gun49.ornek3;

public class GenekMudur extends Calisan {
    double tazminat;

    public GenekMudur(String isim, double maas, int maasKatSayisi, double tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat = tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla() + tazminat;
    }

    @Override
    public String toString() {
        return super.toString() + "tazminat= " + tazminat;
    }
}
