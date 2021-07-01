package gun42.DigerIslemler;

import java.time.LocalDate;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun = LocalDate.now();
        LocalDate dun = buGun.minusDays(1);

        //Bugun dun den sonrami
        boolean sonraMI = buGun.isAfter(dun);
        System.out.println("bugun denden sonra MI = " + sonraMI);

        //bugun denden once MI
        boolean oncaMI = buGun.isBefore(dun);
        System.out.println("Bugun denden once MI " + oncaMI);

        //bugun dun esit mi
        boolean esitMi = buGun.isEqual(dun);
        System.out.println("bugun dun e esitMi = " + esitMi);

        //bu tarih artik yil mi
        boolean artikYilMI = buGun.isLeapYear();
        System.out.println("Bu tarih artik Yil MI = " + artikYilMI);

        //iki tarif arasinda fark var ise farkin en buyuk oldugu degeri veriyor
        int fark = buGun.compareTo(dun.minusYears(2));
        System.out.println("fark = " + fark);
    }
}
