package gun65.enumEk;

public class aylarMain {
    public static void main(String[] args) {
        Aylar ay = Aylar.AGUSTOS;
        System.out.println("ay.getisim() = " + ay.getisim());
        System.out.println("ay.getAyNo() = " + ay.getAyNo());
        System.out.println("ay = " + ay.getGunSayisi());
    }
}
