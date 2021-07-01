package Methods.SecondDay;

public class Methods_5 {
    public static void main(String[] args) {

        //todo Girilen iki ismin uzunluklarının aynı olup olmadığını kontrol eden bir method oluşturunuz. Main'de yazdırınız.

        System.out.println("Bu iki ismin uzunluğu aynıdır: " + isSameLength("Burak", "Murat"));

    }

    public static boolean isSameLength(String name1, String name2) {
        return name1.length() == name2.length();
    }

}
