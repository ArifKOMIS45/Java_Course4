package gun59.denme;


public class TecnoKitchen {

    public static void Hazirla(IFood f) {
        if (f instanceof AdanaKebab) {
            System.out.println("*******Adana Kebab********");
            AdanaKebab a = new AdanaKebab();
            a.marinade();
            a.grill();
            a.taste();
        }
        if (f instanceof Lahmacun) {
            System.out.println();
            System.out.println("*******Lahmacun********");
            Lahmacun l = new Lahmacun();
            l.dough();
            l.addMeat();
            l.bake();
            l.taste();
        }

        if (f instanceof Borsh) {
            System.out.println();
            System.out.println("*******Borsh********");
            Borsh borsh = new Borsh();
            borsh.boil();
            borsh.eatTomorrow();
            borsh.taste();
        }
        if (f instanceof Palov) {
            System.out.println();
            System.out.println("*******Palov********");
            Palov p = new Palov();
            p.fry();
            p.boil();
            p.taste();
        }

    }
}
