package calismalar;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class calisma3 {
    public static void main(String[] args) {
        Date simdiki = new Date();
        System.out.println("simdiki = " + simdiki);

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        System.out.println(timeFormat.format(simdiki));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("dateFormat = " + dateFormat.format(simdiki));

        LocalTime time = LocalTime.now();

        System.out.println("time = " + time);
        DateTimeFormatter ozel = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("ozel time" + ozel.format(time));


    }
}
