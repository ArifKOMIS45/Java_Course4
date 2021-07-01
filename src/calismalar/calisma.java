package calismalar;

public class calisma {
    public static void main(String[] args) {
        String ar = "Arif";
        int a = ar.equals("arif") ? 5 : 10;//bu yazi sekli if gibi calisiyor() ici condition
        // ? mark--> ise= demek sonra gelen condition true -:- isaretinden sonra gelen else yani false ise
        System.out.println("a = " + a);

        int b = (int) (Math.random() * 20 + 1);
        int c = (int) (Math.random() * 20 + 1);

        int result = (b > c) ? b : c;

        String result1 = b > c ? "b" : "c";
        System.out.println("result =>> " + result1 + "=" + result);
    }
}
