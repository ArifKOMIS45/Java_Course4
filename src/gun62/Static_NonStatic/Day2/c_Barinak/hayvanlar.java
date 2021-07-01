package Static_NonStatic.Day2.c_Barinak;

import java.util.Scanner;

public class hayvanlar {

    String hayvan;
    int yasi;
    String renk;


    public void tercihler() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; ) {  //for loopu if den sonra ekle

            System.out.print("Hangi hayvanı sahiplenmek istiyorsunuz?");
            hayvan = sc.nextLine(); //kEdi

            if (hayvan.equalsIgnoreCase("kedi")) {

                yasi = 4;
                renk = "beyaz";
                System.out.println("Hangi hayvan:  " + hayvan.toLowerCase() + "\n yaş :  " + yasi + "\n Rengi " + renk);
                break;

            } else if (hayvan.equalsIgnoreCase("köpek")) {

                yasi = 3;
                renk = "siyah";

                System.out.println("Hangi hayvan:  " + hayvan.toLowerCase() + "\n yaş :  " + yasi + "\n Rengi " + renk);
                break;

            } else {
                System.out.println("Barınağımızda böyle bir hayvan yoktur..");
            }
        }
    }


}
