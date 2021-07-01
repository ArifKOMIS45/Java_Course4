package While_Do_While;

public class WhileDoWhile2 {
    public static void main(String[] args) {

        int sayi = 1;
        int toplam = 0;

        while (sayi <= 10) {

            toplam = toplam + sayi;
            //1         0       1
            //3         1       2
            //6         3       3
            //10        6       4
            //15        10      5
            //21        15      6
            //28        21      7
            //36        28      8
            //45        36      9
            //55        45      10
            sayi++;

        }
        System.out.println("Toplam: " + toplam);

    }
}
