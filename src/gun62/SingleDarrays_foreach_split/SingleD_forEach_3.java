package SingleDarrays_foreach_split;

public class SingleD_forEach_3 {
    public static void main(String[] args) {

        //TODO  For loop ile for Each loop'un farkı

        String[] gezegenler = {"Saturn", "Merkür", "Mars", "Dünya", "Neptün"};

        //For Loop versiyonu
        System.out.println("For Loop: ");
        for (int i = 0; i < gezegenler.length; i++) {
            System.out.println(gezegenler[i]);
        }

        System.out.println(" ----------------------- ");

        //For Each Versiyonu
        System.out.println("\nFor each: ");
        for (String Str : gezegenler) {
            System.out.println(Str);
        }

    }
}
