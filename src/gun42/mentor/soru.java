package gun42.mentor;

public class soru {


    double eyaletVergisi(String sayi) {

        String str = sayi.replaceAll("[^0-9]", "");
        double rakam1 = Double.parseDouble(str);
        double v = rakam1 * 0.0075;
        return v;
    }

}
