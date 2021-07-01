package gun49.ornek1;

public class SirketMain {
    public static void main(String[] args) {
        Yonetici mudur = new Yonetici();
        mudur.maas = 3000;
        mudur.departman = "Destek Birimi";
        System.out.println(mudur.getMaas());
        mudur.zamYap(25);

        Personel guvenlikci = new Personel();
        guvenlikci.maas = 1500;
        System.out.println(guvenlikci.getMaas());


    }


}
