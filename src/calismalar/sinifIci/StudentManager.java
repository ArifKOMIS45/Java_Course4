package calismalar.sinifIci;

public class StudentManager {
    protected String[] dersler = {"Tarih", "Matematik", "Bilgisayar", "Fizik", "Resim"};
    protected String[] ogrDersler;

    protected int indirimYap(int yas, String[] ogrDersler) {
        int miktar = 0;
        if (yas < 18) {
            for (int i = 1; i <= ogrDersler.length; i++) {
                miktar += i * 600;
                miktar = (int) (miktar - (miktar * 0.1));

            }
            if (ogrDersler.length == 5) {
                miktar = (int) (miktar - (miktar * 0.05));
            }
        }
        if (ogrDersler.length == 5) {
            miktar = 3000;
            miktar = (int) (miktar - (miktar * 0.05));
        }

        return miktar;
    }
}
