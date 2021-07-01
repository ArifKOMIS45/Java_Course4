package gun57.Ornek1;

public abstract class BinekOto {
    private String marka;
    private int UretimYili;
    private int vitesAdedi;

    //impliment edilmek zorunda
    public abstract String getMarka();

    //ister override edilebilir,issterse yapilmayabilir
    public int getUretimYili() {
        return UretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.UretimYili = uretimYili;
    }


}
