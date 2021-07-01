package Access_Modifiers_3;

public class Access_1 {

    /*  ornek1
     adi eyaletVergisi olan bir method olusturun
     ve bu method ayni package icinde erisilebilir olsun
     return tipi double ve parametresi bir String
     tum $ ve , isaretlerini kaldirip, degeri double olarak degistiriniz (vergi orani ise double degerin 7.75 idir)
     */

    //default
    protected double eyaletVergisi(String rakam) {

        rakam = rakam.replace("$", "");
        rakam = rakam.replace(",", "");

        //rakam = rakam.replaceAll("\\$","").replaceAll("\\,","");

        double deger = Double.valueOf(rakam);
        double vergi = deger * 0.0775;

        return vergi;
    }

}
