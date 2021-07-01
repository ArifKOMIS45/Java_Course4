package Odevler.odevEncapsulation5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yazar adini giriniz= ");
        String authorName = scan.nextLine();
        System.out.print("Kitap adini giriniz= ");
        String bookName = scan.nextLine();

        Book book = new Book(bookName, authorName);
        System.out.println(book);


    }
}
