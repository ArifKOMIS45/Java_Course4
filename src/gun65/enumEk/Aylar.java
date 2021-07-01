package gun65.enumEk;

public enum Aylar {
    OCAK(31, 1, "OCAK"),
    SUBAT(28, 2, "SUBAT"),
    MART(31, 3, "MART"),
    NISAN(30, 4, "NISAN"),
    MAYIS(31, 5, "MAYIS"),
    HAZIRAN(30, 6, "HAZIRAN"),
    TEMMUZ(31, 7, "TEMMUZ"),
    AGUSTOS(31, 8, "AGUSTOS"),
    EYLUL(30, 9, "EYLUL"),
    EKIM(31, 10, "EKIM"),
    KASIM(30, 11, "KASIM"),
    ARALIK(31, 12, "ARALIK");

    private final int gunSayisi;
    private final int ayNo;
    private final String isim;


    Aylar(int gunSayisi, int ayNo, String isim) {
        this.gunSayisi = gunSayisi;
        this.ayNo = ayNo;
        this.isim = isim;
    }

    public int getGunSayisi() {
        return gunSayisi;
    }

    public int getAyNo() {
        return ayNo;
    }

    public String getisim() {
        return isim;
    }
}
