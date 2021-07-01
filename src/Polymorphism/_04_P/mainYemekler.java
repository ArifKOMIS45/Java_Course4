package Polymorphism._04_P;

public class mainYemekler {
    public static void main(String[] args) {

        yemekler anaYemekler = new anaYemekler("Türkmen Pilavı");
        System.out.println(anaYemekler.siparis());

        yemekler salatalar = new salatalar("Çoban salatası");
        System.out.println(salatalar.siparis());

        yemekler tatlilar = new tatlilar("Baklava");
        System.out.println(tatlilar.siparis());


    }
}
