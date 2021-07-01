package gun47.ornekler.ornek1;

public class Kisi {
    String ad;
    String soyad;
    private int yas;

    //degiskene direk erisime kapatip
    //bir metod ile korumali setleme islemine Encapsulation denir
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);
    }

    @Override
    public String toString() {
        return "ad:'" + ad + '\'' +
                ", soyad:'" + soyad + '\'' +
                ", yas:" + yas;
    }
}
