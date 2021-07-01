package Gun59;

public class TechnoKitchen {

    public static void Hazirla(IFood f) {

        if (f instanceof AdanaKebap) {
            AdanaKebap a = new AdanaKebap();
            a.marinade();
            a.grill();
            a.taste();
        }
        if (f instanceof Lahmacun) {
        }


    }

}
