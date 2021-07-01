package gun49.ornek3;

public class Calisan {
    String isim;
    double maas;
    int maasKatSayisi;

    public Calisan(String isim, double maas, int maasKatSayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatSayisi = maasKatSayisi;
    }

    public double maasHesapla() {
        return maas * maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                '}';
    }
}
