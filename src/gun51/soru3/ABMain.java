package gun51.soru3;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A.mesaj = " + A.mesaj);

        B b = new B();
        System.out.println("B.mesaj = " + B.mesaj);

        A a2 = new A();
        System.out.println("A.mesaj = " + A.mesaj);

        // Static değişkenlerin olduğu classlardan
        // oluşturulan subclaslarda, static değişkenin
        // değeri değiştirildiğinde, super classdaki de değişir.
        // Çünkü static değişkenler hafızada tek bir değeri
        // gösterirler.


    }
}
