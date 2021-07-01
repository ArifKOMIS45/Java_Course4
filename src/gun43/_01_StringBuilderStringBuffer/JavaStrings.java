package gun43._01_StringBuilderStringBuffer;

import java.util.Arrays;

public class JavaStrings {
    public static void main(String[] args) {
        String cumle = "";

        // String değişkeni çok fazla ekleme veya işlemlere
        // göre perfomansı oldukça düşük.
        cumle += "Bugün";
        cumle += " hava";
        cumle += " sıcak";

        cumle = cumle.concat("yeni kelime"); // atama gerekir

        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır. Fakat paralel çalışan
        // uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.

        // String, StringBuilder, StringBuffer

        StringBuilder s = new StringBuilder();
        s.append("Bugün");
        s.append(" hava");
        s.append(" sıcak");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());

        s.append(4); // ekleneleri stringe çevirip ekler.

        s.reverse(); // stringi tersine çevirir
        System.out.println("s = " + s);

        s.reverse();
        System.out.println("s = " + s);

        s.delete(0, 5);// 0 dahil 5 hariç 5 e kadar, olan bölümü sildi.
        System.out.println("s = " + s);

        s.deleteCharAt(3); // sadece belirtilen karakteri siler
        System.out.println("s = " + s);

        s.insert(5, "546");// 5 nolu indexe insert yaptı
        System.out.println("s = " + s);

        s.insert(4, 3.45); // double bile eklenebilir ama strine çevirip ekleyecektir.
        System.out.println("s = " + s);

        int[] dizi = {2, 3, 4, 5, 506};
        s.insert(6, Arrays.toString(dizi));
        System.out.println("s = " + s);

        s = new StringBuilder("Bugün hava sıcak"); // tamamen sıfırla
        System.out.println("s = " + s);

        s.replace(3, 8, "bu");
        // başlangıç ve son verilen bölüme verilen stringi atar,
        // eğer verilen büyük ise aradaki bölüm delete olur. üst sınır hariç
        System.out.println("s = " + s);


    }


}
