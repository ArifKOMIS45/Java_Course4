package OCA_1;

public class oca_6 {
    // pdf 129

    public static void main(String[] args) {

        int x = 1;
        int y = 0;
        if (x++ > ++y) {
            System.out.println("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y);

//        ++x kullanılmadan önce x'in değerini değiştirir (artış öncesi).
//        x++ kullanıldıktan sonra (artım sonrası) x'in değerini değiştirir.
    }

    /*

    A) Hello Log 1 : 0
    B) Hello Log 2:1
    C) Welcome Log 2:1 *****
    D) Welcome Log 1:0


     */
}
