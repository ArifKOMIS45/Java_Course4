package String_Methods_2;

public class StartsWith {
    public static void main(String[] args) {

        String baslangic = "Galaksi";

        System.out.println(baslangic.startsWith("Ga")); //true
        System.out.println(baslangic.startsWith("lak")); //false
        System.out.println(baslangic.startsWith("si")); //false

        System.out.println("------------------------------------");

        System.out.println(baslangic.endsWith("Ga"));
        System.out.println(baslangic.endsWith("lak"));
        System.out.println(baslangic.endsWith("si"));


    }
}
