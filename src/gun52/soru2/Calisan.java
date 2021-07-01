package gun52.soru2;

public class Calisan extends Kisi {
    double maas;

    public Calisan(String isim, String adres, Okul okul, double maas) {
        super(isim, adres, okul, UyelikTipi.Calisan);
        setMaas(maas);
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return super.toString() + " Maas= " + getMaas();
    }
}
