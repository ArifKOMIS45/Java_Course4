package gun57.Ornek2;

public class Main {
    public static void main(String[] args) {
        Dikdortgen d = new Dikdortgen(4, 5);
        d.setName("Dikdortgen");
        System.out.println("d = " + d);

        Cember c = new Cember(6);
        c.setName("Cember");
        System.out.println("c = " + c);
        d.ciz();
        c.ciz();

    }
}
