package Encapsulation_2.USER;

import java.util.Scanner;

public class mainUser {
    public static void main(String[] args) {


        int userCount = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print((userCount + 1) + ".Username= ");
            String username = sc.nextLine();

            System.out.print("Password= ");
            String password = sc.nextLine();

            try {
                User newUser = new User(username, password);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }


            userCount++;

        } while (userCount < 2);


    }


}
