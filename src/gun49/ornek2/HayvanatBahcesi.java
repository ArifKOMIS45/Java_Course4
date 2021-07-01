package gun49.ornek2;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("yok", 0, "Genel");
        hayvan.konustu();

        System.out.println("********************");
        Kopek kopek = new Kopek("beyaz", 10, "kangal");
        kopek.konustu();

        System.out.println("*********************");
        Kus kus = new Kus("sari", 1, "muhabbet");
        kus.konustu();


    }
}
