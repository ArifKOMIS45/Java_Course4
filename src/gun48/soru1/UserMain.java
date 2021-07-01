package gun48.soru1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<User> liste = new ArrayList<>();
        int sayac = 1;
        String userName = "";
        boolean usurnameIste = true;
        do {
            if (usurnameIste) {
                System.out.print(sayac + " user name giriniz=");
                userName = scan.nextLine();
            }
            System.out.print(sayac + " password giriniz=");
            String password = scan.nextLine();
            try {
                User yeni = new User(userName, password);
                liste.add(yeni);
                sayac++;
                usurnameIste = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                usurnameIste = false;
            }


        } while (liste.size() < 2);
        liste.forEach(System.out::println);


    }
}
