package gun54.Soru;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen d = new Dikdortgen();

        System.out.println("Alan= " + d.Alan(4, 5));
        System.out.println("Cevre= " + d.Cevre(4, 5));
        System.out.println("------------------------------");
        Kare k = new Kare();
        System.out.println("k.Alan() = " + k.Alan(4));
        System.out.println("k.Cevre() = " + k.Cevre(4));
    }
}
