package Odevler.odevEncapsulation4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Salary: ");
        int salary = scan1.nextInt();
        System.out.print("Date of birth: ");
        String dop = scan.nextLine();

        Emplyees calisan = new Emplyees(name, salary, dop);
    }
}
