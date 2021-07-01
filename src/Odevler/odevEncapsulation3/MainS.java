package Odevler.odevEncapsulation3;


import java.util.Scanner;

public class MainS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Isim girin: ");
        String n1 = scan.nextLine();
        System.out.print("Yasini girin: ");
        int i1 = scan1.nextInt();
        Student ogr = new Student(n1, i1);
    }
}
