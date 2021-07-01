package OCA_1;

public class oca_10 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        //StringBuilder'lar ile String'ler ".toString" mrthodu olmadan karşılaştırılamıyorlar.
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }

    }
/*

    A) Match 1
    B) Match 2 ****
    C) No Match
    D) A NullPointerException is thrown at runtime

 */

}
