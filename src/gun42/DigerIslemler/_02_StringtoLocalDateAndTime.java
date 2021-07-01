package gun42.DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_StringtoLocalDateAndTime {
    public static void main(String[] args) {
        //kullnicidan alinan veya string durumunda olan bir time veya tarih
        //      bilgisinin time ve date degiskenine cevrilmesi

        String strDate = "01 25 2020";//25/01/2020

        //String degeri tarihe cevirmek icin format belirledik
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd yyyy");
        //Stringin formati bu formatat uygun olmali.parce ile cevirdik
        LocalDate tarih = LocalDate.parse(strDate, format);
        System.out.println("tarih = " + tarih);

        String strTime = "12:49";
        LocalTime saat = LocalTime.parse(strTime);
        System.out.println("saat = " + saat);

    }


}
