package gun53.JavaPolymorphism.Anlatim;

import java.util.HashSet;
import java.util.Set;

public class Ciftlik {
    public static void main(String[] args) {
        Kopek kopek = new Kopek("karabas");
        Kedi kedi = new Kedi("kopuk");

//        kopek.ses();
//        kedi.ses();

        HashSet hs = new HashSet();
        Set hs2 = new HashSet();
        //set: referans tipi
        //Hashset: nesne tipi

        Hayvan kopek2 = new Kopek("Karabas2");
        Hayvan kedi2 = new Kedi("pamuk");
        kopek2.ses();//referansi hayvan oldugu icin sadece ses cikar yazacak
        kedi2.ses();

        System.out.println("------------------------");
        hayvanSesi(kopek2);
        hayvanSesi(kedi2);


    }

    public static void hayvanSesi(Hayvan hayvan) {
        //kopek buraya hayvan olarak geliyor
        //aslinda kopek sinifinda
        hayvan.ses();
    }


}
