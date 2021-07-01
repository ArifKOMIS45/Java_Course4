package gun54.Ornek4;

public class Test implements IYazdir, IGoster {
    @Override
    public void goster() {
        System.out.println("goster..");
    }

    @Override
    public void yaz() {
        System.out.println("yaz");
    }

    @Override
    public void yaz(String mesaj) {
        System.out.println(mesaj + " yaz");
    }
//impliment edilen interfacelerde ayni isim ve parametrede
    //olan metodlardan bir tane yazmak yeterlidir
    //problem olusturmaz


}
