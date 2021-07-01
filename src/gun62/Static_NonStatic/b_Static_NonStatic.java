package Static_NonStatic;

public class b_Static_NonStatic {

    //todo            Static Method vs Static Olmayan Method
    //todo            void = hiçlik
    //todo            Static'leri Static elektrik olarak kodlayabilirsiniz.

    public static void buMethodStatic() {
        System.out.println("Merhaba");

    }

    public static void main(String[] args) {
        buMethodStatic();
        // buMethodStaticDegil();  Bu Compile Error verir.

        // Bu yöntem static olayan methodu çağırmamıza yarıyor.
        b_Static_NonStatic yeniObje = new b_Static_NonStatic();     //Class'a referans atıyoruz.
        yeniObje.buMethodStaticDegil();                             //Class isminize dikkat edin. Yoksa hata verir.
    }

    public void buMethodStaticDegil() {
        System.out.println("Selamlar");

    }
}

