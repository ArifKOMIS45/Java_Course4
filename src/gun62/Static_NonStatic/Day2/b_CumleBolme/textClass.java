package Static_NonStatic.Day2.b_CumleBolme;

public class textClass {   //todo (1)

    String text1 = "Yazılım öğreniyorum.";
    String text2 = "Java kursu devam ediyor";


    public String ilkYarisi(String text) {

        int baslangic = 0;

        int ortasi = text.length() / 2;
        return text.substring(baslangic, ortasi);

    }

    public String ikinciYarisi(String text) {

        int ortasi = text.length() / 2;

        return text.substring(ortasi); //substring methodunda son belirlemezsek kalanını alır.
    }

}
