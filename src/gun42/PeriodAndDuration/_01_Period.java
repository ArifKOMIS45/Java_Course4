package gun42.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _01_Period {
    public static void main(String[] args) {
        //period iki tarih arasindaki gecen zamani gun ay yil olarak verir
        //DateTime icin kullanili,kendsi ayni zamanda belli bir zman araligini tutabilir

        LocalDate dyDogungunu = LocalDate.of(1976, 3, 21);
        LocalDate bugun = LocalDate.now();
        Period fark = Period.between(dyDogungunu, bugun);
        System.out.println("fark = " + fark);
//        System.out.println("fark.getYears() = " + fark.getYears());
//        System.out.println("fark.getMonths() = " + fark.getMonths());
//        System.out.println("fark.getDays() = " + fark.getDays());
        System.out.println("Arif'in omru  " + fark.getYears() + "yil" + " " + fark.getMonths() + "ay"
                + " " + fark.getDays() + "gun 'dur.");

        //***********
        Period period3Gun = Period.ofDays(3);
        Period ceyrekYil = Period.ofMonths(3);

        LocalDate ucGunSonra = bugun.plus(period3Gun);//bugune 3 gun eklendi.

        LocalDate ucAySonra = bugun.plus(ceyrekYil);
        LocalDate buGunTekrar = ucAySonra.minus(ceyrekYil);

        //ornek kursun sureleri

        LocalDate kursunBaslangic = LocalDate.of(2021, 2, 1);
        Period kursSure = Period.ofMonths(8);
        LocalDate kursBitis = kursunBaslangic.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis.format(DateTimeFormatter.ISO_DATE));
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());


    }
}
