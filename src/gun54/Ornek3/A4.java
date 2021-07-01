package gun54.Ornek3;


public class A4 implements IYazdiralabilir, IGosterilebilir {
    @Override
    public void goster() {
        System.out.println("goster");
    }

    @Override
    public void yaz() {
        System.out.println("yaz");
    }
}
