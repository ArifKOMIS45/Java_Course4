package OCA_1;

import java.util.ArrayList;
import java.util.List;


public class oca_3 {

//       pdf 33

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")) {
            names.remove("Jon");
        }
        System.out.println(names);
    }


//    A) [Robb, Rick, Bran] *****
//    B) [Robb, Rick]
//    C) [Robb, Bran, Rick, Bran]
//    D) An exception is thrown at runtime (Çalışma sırasında hata)


}
