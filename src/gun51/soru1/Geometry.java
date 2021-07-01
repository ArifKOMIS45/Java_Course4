package gun51.soru1;

public class Geometry {
    public static void main(String[] args) {
        Cember cember = new Cember(3);
        System.out.println("cember.getCevre() = " + cember.getCevre());

        //System.out.println("cember.getAlan() = " + cember.getAlan()); kullandirmiyoruz

        Dikdortgen d = new Dikdortgen(5, 4);
        System.out.println("d.getAlan() = " + d.getAlan());
        System.out.println("d.getCevre() = " + d.getCevre());

        Kare k = new Kare(5);
        System.out.println("k.getAlan() = " + k.getAlan());
        System.out.println("k.getAlan() = " + k.getCevre());
        System.out.println("k = " + k);


    }


}
