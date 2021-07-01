package Methods;

public class methods_2 {
    public static void main(String[] args) {

        selamlama();
        hesaplama(12, 4);
        true_false(false);
        not(5.3);
    }

    public static void selamlama() {
        System.out.println("Merhaba Dünya");
    }

    public static void hesaplama(int a, int b) {
        System.out.println(a + b);
    }

    public static void true_false(boolean myBoolean) {
        System.out.println(myBoolean);
    }

    public static void not(double myDouble) {
        System.out.println(myDouble);

    }

}
