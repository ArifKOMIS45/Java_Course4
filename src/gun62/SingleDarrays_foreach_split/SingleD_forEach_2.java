package SingleDarrays_foreach_split;

public class SingleD_forEach_2 {
    public static void main(String[] args) {

        //TODO         Integer Array'indeki elemanları for each döngüsüyle toplayınız.

        int[] SayiArrayi = {5, 8, 35, 90, 12};
        int toplam = 0;

        for (int yeniSayı : SayiArrayi) {
            toplam += yeniSayı;
        }

        System.out.println("Toplam: " + toplam);


    }
}
