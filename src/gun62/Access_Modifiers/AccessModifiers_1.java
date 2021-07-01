package Access_Modifiers;

    /* Access Modifier'lar nedir?

    Sınıfların erişim düzeyini ayarlamımızı sağlıyor.

    Bir sınıfın belirli başka bir sınıfa ya da onun field, constructor ve methodlarına erişimini de düzenler.

    -- public

    -- private

    -- protected

    -- default

     Aralarindaki farklar nelerdir?

    public
        Public erişim düzenleyici en yüksek seviyede erişim düzenleyicisidir.
        Kalıtım yolu ile aktarılır, farklı projelerden veya proje içerisinde herhangi bir yerden erişilebilir durumdadır.

    protected
        Protected erişim düzenleyicisi genel olarak private gibi hareket eder.
        Aralarındaki tek fark protected olarak işaretlenmiş olan yapılar kalıtım yolu ile aktarılabilmektedir.
        //inheritanc OOP (Baba-Oğul)
        Geri kalan tüm özellikleri private ile aynıdır.

    private
        Private erişim düzenleyicisi en kısıtlı erişim düzenleyicisidir.
        Sadece ilgili tip içerisinden erişilebilirler.
        Private tanımlamasını değişkenlere ve methodlara atayabiliriz.
        Kalitim yolu ile aktarilmaz.

    default (package private)
        Sadece o proje içerisinden erişilebilmesi anlamına gelmektedir.
        Farklı projelerden erişim söz konusu değildir.

    Class icin yalnizca public ve default modifier lar kullanilabilir.

    */

public class AccessModifiers_1 {

    public int yas; //todo  (1)
    //
    protected double numara;
    //
    String sehir;
    private String isim;


}
