package gun52.soru1;

public class Ogrenci {
    private static int sayac = 1;
    private final int id;
    private final String isim;
    private final String tipi;

    public Ogrenci(String isim, String tipi) {
        this.id = sayac++;
        this.isim = isim;
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
