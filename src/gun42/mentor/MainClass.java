package gun42.mentor;

public class MainClass {
    /*  ornek1
         adi eyaletVergisi olan bir method olusturun
         ve bu method ayni package icinde erisilebilir olsun
         return tipi double ve parametresi bir String
         tum $ ve , isaretlerini kaldirip, degeri double olarak degistiriniz (vergi orani ise double degerin 7.75 idir)
         */
    public static void main(String[] args) {
        soru eyaletVergisi = new soru();

        System.out.println(" vergi= " + eyaletVergisi.eyaletVergisi("450.56"));

    }


}
