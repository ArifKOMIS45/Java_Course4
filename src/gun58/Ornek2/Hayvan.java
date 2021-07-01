package gun58.Ornek2;

import java.time.LocalDate;

public abstract class Hayvan {
    private static int sayac = 1;
    private String isim;
    private boolean vahsi;
    private LocalDate dogumTarihi;
    private int id;

    public Hayvan() {
        setId();
    }

    public abstract void yiyecegi();

    public abstract void yemekMiktari();

    public abstract void gunlukUykuSuresi();

    public abstract void sesi();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(int year, int mounth, int day) {
        dogumTarihi = LocalDate.of(year, mounth, day);
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = sayac++;
    }

    @Override
    public String toString() {

        return "Hayvan{" +
                "isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi=" + dogumTarihi +
                ", id=" + id +
                '}';
    }
}
