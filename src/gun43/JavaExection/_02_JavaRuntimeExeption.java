package gun43.JavaExection;

import java.util.Scanner;

public class _02_JavaRuntimeExeption {
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz= ");
        int a = oku.nextInt();
        System.out.print("2. sayiyi giriniz= ");
        int b = oku.nextInt();

        System.out.println("a/b = " + a / b);


    }
}