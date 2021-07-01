package Gun59;

public class Lahmacun implements IFood {
    @Override
    public void taste() {
        System.out.println("mükemmel yerli pizza..");
    }

    @Override
    public double ucret() {
        return 3;
    }

    public void dough() {
        System.out.println("Mayalı hamur hazırlandı..");
    }

    public void addMeat() {
        System.out.println("Özel kıyma eklendi..");
    }

    public void bake() {
        System.out.println("Odun ateşinde pişirildi.");
    }

}
