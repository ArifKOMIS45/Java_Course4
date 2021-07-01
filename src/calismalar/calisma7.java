package calismalar;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class calisma7 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String dg = "21/03/1976";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("today = " + today);
        //LocalDate birth = LocalDate.parse(dg,formatter);

        //today.format(formatter);
        int year = Period.between(LocalDate.parse(dg, formatter), today).getYears();

        System.out.println("year = " + year);


    }
}
