package String_Methods_1;

public class equalsIgnoreCase {
    public static void main(String[] args) {

        String firstName = "burak";
        String firstName2 = "bUrAk";
        String lastName = "Türkmen";

        System.out.println(firstName.equalsIgnoreCase(firstName2));
        System.out.println(firstName.equalsIgnoreCase(lastName));


    }

}
