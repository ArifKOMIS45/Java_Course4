package gun54.ornek2;

public class Grefiker {
    public static void main(String[] args) {
        //bir iinterface birden fazla class tarafindan impilimente edilmesi
        Cember c = new Cember();
        c.ciz();

        Dikdortgen d = new Dikdortgen();
        d.ciz();

        //bu polymorphism sayaesinde olusturulabilir
        ICizilebilir cember2 = new Cember();
        cember2.ciz();

    }

}
