package gun56.Soru1;

import java.util.ArrayList;

public class OtoGalaeri {
    public static void main(String[] args) {
        Tesla teslaCar = new Tesla("Model 5", 310);
        ToyotaPrus pirus = new ToyotaPrus("pirus", 1200);
        Bus bus = new Bus("IVECO", 7600);
        teslaCar.ChangeBattery();

        ArrayList<Vehicle> arabalar = new ArrayList<>();
        arabalar.add(teslaCar);
        arabalar.add(pirus);
        arabalar.add(bus);

        for (Vehicle v : arabalar) {
            System.out.println("v = " + v);
            System.out.println("v.getClass().getSimpleName() = " + v.getClass().getSimpleName());
        }
        System.out.println("----------------------------");
        arabalar.forEach(System.out::println);

    }
}
