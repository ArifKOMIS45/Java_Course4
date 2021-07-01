package Odevler.odevEncapsulation2;

import java.util.Scanner;

public class MainS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Abone olmak istiyormusunuz(true/false)=");
        boolean doYouWanaSubscribe = scan1.nextBoolean();
        System.out.print("isim giriniz=");
        String name = scan.nextLine();

        System.out.print("hangi uyeligi istiyorsunuz(gold,silver,bronze,istemiyorum)=");
        String whichMember = scan.nextLine();
        Subscribe uye = new Subscribe(name, doYouWanaSubscribe, whichMember);


    }
}
