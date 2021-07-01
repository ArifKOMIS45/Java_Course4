package Methods.SecondDay;

public class Methods_4 {
    public static void main(String[] args) {

        //todo Girilen isimlerin sadece baş harflerini alan bir method oluşturunuz. Main'de yazdırınız
        // B.T.

        System.out.println(basHarf("Ömer") + basHarf("Özdemir"));

    }

    public static String basHarf(String isim) {
        return isim.charAt(0) + ".";

    }

}
