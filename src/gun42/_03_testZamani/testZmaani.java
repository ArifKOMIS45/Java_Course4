package gun42._03_testZamani;

import org.junit.Assert;
import org.junit.Test;

public class testZmaani {
    //Kullanicin yazdigi metodu iki adet test yazarak test ediniz
    //todo:Metod:aldigi bir sifrenin 8 karakterdek az olmamasini ve
    //icinde en az bir rakam ve harf olup olmadigini kontrol eden bir metod olsun

    @Test
    public void passCheck1() {
        //olusan sonuc manasinda actual deniyor
        boolean olusan = PasswordCheck.passCheck("bayrak5");

        //beklenen manasinda expected deniyor
        boolean beklenen = false;

        //1.bolum testra mesaj, 2. bolum expected, 3.bolum actual
        Assert.assertEquals(" false bekleniyordu true geldi", beklenen, olusan);

    }

    @Test
    public void passCheck2() {
        //olusan sonuc manasinda actual deniyor
        boolean olusan = PasswordCheck.passCheck("bayrak55");

        //beklenen manasinda expected deniyor
        boolean beklenen = true;

        //1.bolum testra mesaj, 2. bolum expected, 3.bolum actual
        Assert.assertEquals(" true bekleniyordu false geldi", beklenen, olusan);

    }


}
