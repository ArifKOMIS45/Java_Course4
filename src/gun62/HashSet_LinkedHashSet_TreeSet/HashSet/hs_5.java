package HashSet_LinkedHashSet_TreeSet.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class hs_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> hs = new HashSet<>();

        hs.add("Burak");
        hs.add("Gülsüm");
        hs.add("Mustafa");
        hs.add("Elif");
        hs.add("Zeynep");
        hs.add("Ömer");
        hs.add("Fatih");

        boolean usernameAccepted = false;
        System.out.println("Kullanıcı adı giriniz: ");

        do {
            String username = sc.next();
            if (hs.add(username)) {
                System.out.println("Kullanıcı adı geçerli...");
                usernameAccepted = true;

            } else System.out.println("Kullanıcı adı alınmış. Tekrar deneyiniz...");
        } while (!usernameAccepted);
    }

}
