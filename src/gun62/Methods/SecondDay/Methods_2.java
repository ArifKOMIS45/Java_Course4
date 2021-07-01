package Methods.SecondDay;

public class Methods_2 {
    public static void main(String[] args) {

        //todo      İki sayılı bir method oluşturunuz. Farklı sayılarla iki adet toplama işlemi yapınız.
        //          Sonrasında bu iki toplama işleminin sonuçlarını toplayınız.
        //                  Main'de yazdırınız. Return kullanınız.

        int ilkIslem = ikiSayininToplami(3, 7);
        int ikinciIslem = ikiSayininToplami(6, 4);

        System.out.println("İlk işlemin sonucu: " + ilkIslem);
        System.out.println("İkinci işlemin sonucu: " + ikinciIslem);

        int sonIslem = ikiSayininToplami(ilkIslem, ikinciIslem);

        System.out.println(" 4 sayınında toplamı: " + sonIslem);


    }

    public static int ikiSayininToplami(int number1, int number2) {
        int toplam = number1 + number2;
        return toplam;

    }
}
