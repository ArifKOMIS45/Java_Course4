package gun53.finalAttirubute;

public class ArabaMain {
    public static void main(String[] args) {
        Araba araba = new Araba("Ford");
        System.out.println("araba.Model = " + araba.Model);
        Araba araba2 = new Araba("Opel");
        System.out.println("araba2.Model = " + araba2.Model);
        //araba2.Model="Honda";
        //final tipi degiskenlerde deger sadece tanimlandigi yerde veya contructorda da
        //atanabilir,sonradan degistirilemez


    }
}
