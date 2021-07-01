package gun49.soru;

public class Otobus extends Arac {
    int yolcuSayisi;


    public Otobus(String renk, int motor, int model, int yolcuSayisi) {
        super(renk, motor, model);
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public String toString() {
        return super.toString() + ", yolcu sayisi=" + yolcuSayisi;
    }
}
