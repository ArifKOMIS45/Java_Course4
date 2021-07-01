package gun63;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {
        // basit tipler : int , double, float, char (bunlar izin vermez)
        // Wrapper Class: Integer, Double, Float, String, Character (null a izin verir)
        Integer[] dizi = {1, 2, null};


        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);

        points.remove(1);// 1 nolu indexteki elemanı yani 2 yi siler
        // 1,3,4, null

        points.remove(null);
        // 1,3,4

        System.out.println(points);

        // 1 içeriği nasıl silerim ?
        //points.remove(0);
        points.remove((Object) 1);// 1 değerli içeriği silmek istersek, Object olduğunu
        // yani içerik olduğunu belirtmemiz gerekir, bunun için OBJECT CAST yapmalıyız.
        // (Object)1   gibi.

        System.out.println(points); // 3,4
    }
}
