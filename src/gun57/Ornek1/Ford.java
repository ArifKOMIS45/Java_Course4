package gun57.Ornek1;

public class Ford extends BinekOto {


    //abstract metod oldugundan zorunlu olarakyazilmak zorunda(impliment edildi)
    @Override
    public String getMarka() {
        return "Ford Focus";
    }
    //abstract icindeki metodlari ister dldugu gibi isterse override edebilir


    @Override
    public int getUretimYili() {
        System.out.println("Uretildigi yil");
        return super.getUretimYili();
    }
}
