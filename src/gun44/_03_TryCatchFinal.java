package gun44;

public class _03_TryCatchFinal {
    public static void main(String[] args) {
        long startTime = 0;
        try {
            startTime = System.currentTimeMillis();
            String str = "bugun";
            System.out.println("hatadan onceki nokta ");
            char ilkHarf = str.charAt(9);
            System.out.println("hatadan sonraki nokta ");

        } catch (Exception ex) {
            System.out.println("catch bolumu calisti");
        } finally {//hata olsuda olmasada calisiyor,herzaman

            System.out.println(System.currentTimeMillis() - startTime + "ms");//islem zamani belirlendi

            System.out.println("Finally bolumu calisti");
            //Kullanim sebebi:try-catch in icinde yapilmis
            // islemlerde arta kalan kapama gibi bu bolume ait
            //islemler yapilarak kod duzeni saglanmis olur.
        }
        System.out.println("Try-catch blogundan sonra calisan bolum");

    }
}
