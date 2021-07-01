package gun58.Ornek2;

public class HaynanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi1 = new Kedi();
        kedi1.setIsim("pamuk");
        kedi1.setVahsi(false);
        kedi1.setDogumTarihi(2017, 1, 17);
        System.out.println("kedi1 = " + kedi1);

        Kartal kartal = new Kartal();
        kartal.setIsim("Kartal");
        kartal.setVahsi(true);
        kartal.setDogumTarihi(2010, 8, 6);
        System.out.println(kartal);
    }
}
