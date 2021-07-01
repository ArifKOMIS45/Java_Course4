package While_Do_While;

public class WhileDoWhile4 {
    public static void main(String[] args) {

        int sayi = 1;
        while (sayi < 11) {
            System.out.println("Sayı: " + sayi);
            sayi++;
        }

        int doSayi = 1;
        do {
            System.out.println("DoSayı: " + doSayi);
            doSayi++;
        } while (doSayi < 11);

    }
}
