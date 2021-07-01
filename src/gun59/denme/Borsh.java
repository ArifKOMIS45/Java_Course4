package gun59.denme;

public class Borsh implements IFood {
    int adet;

    public Borsh(int adet) {
        this.adet = adet;
    }

    public Borsh() {
    }

    @Override
    public void taste() {
        System.out.println("Inannilmaz bir tat, sebze corbasi...");
    }

    @Override
    public double ucret() {
        return 3 * adet;
    }

    public void boil() {
        System.out.println("Uygun sure kaynatildi...");
    }

    public void eatTomorrow() {
        System.out.println("Bir gün dinlendirilmiş olarak servis ediliyor.");
    }


    @Override
    public String toString() {
        return "Borsh{" +
                "adet=" + adet +
                '}';
    }
}
