package gun47.ornekler.ornek2;

public class arabaMain {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.setModel("BMW");
        araba.setRenk("Kirmizi");
        araba.setMotor(1600);
        araba.setKapiSayisi(9);

        System.out.println("araba = " + araba);
        Araba araba2 = new Araba("mavi", "mercedes", 2000, 9);

        System.out.println("araba2 = " + araba2);


    }


}
