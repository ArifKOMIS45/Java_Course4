package gun42.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _02_Duration {
    //time ve datetime arasindaki farki bulur

    public static void main(String[] args) {
        //time farki
        LocalTime geceYarisi = LocalTime.of(0, 0);
        LocalTime ogeVakti = LocalTime.of(13, 2, 1, 0);
        Duration fark = Duration.between(geceYarisi, ogeVakti);
        System.out.println("fark = " + fark);
        System.out.println("fark.toHours() = " + fark.toHours());//farkin toplam saat hali
        System.out.println("fark.toMinutes() = " + fark.toMinutes());
        System.out.println("fark.getSeconds() = " + fark.getSeconds());

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());//farkin sadece tam saat kismini veriyor
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());//dakika olarak

        System.out.println("*******iki zaman farki*********");
        LocalDateTime from = LocalDateTime.of(2020, 10, 4, 10, 20, 55);
        LocalDateTime to = LocalDateTime.of(2020, 10, 10, 10, 21, 1);
        Duration farkZaman = Duration.between(from, to);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());


    }

}
