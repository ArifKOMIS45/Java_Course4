package gun47.ornekler.ornek1;

public class KisiMain {
    public static void main(String[] args) {
        Kisi arif = new Kisi();
        arif.ad = "Arif";
        arif.soyad = "KOMIS";
        arif.setYas(45);

        System.out.println("arif Yas=> " + arif.getYas());
        System.out.println(arif);

    }


}
