package Gun59;

public class Palov implements IFood {
    @Override
    public void taste() {
        System.out.println("Çocukları vazgeçilmezi");
    }

    @Override
    public double ucret() {
        return 4;
    }

    public void fry() {
        System.out.println("prinç ve şehriye kavruldu");
    }

    public void boil() {
        System.out.println("Kısık ateşte pişirildi.");
    }

}
