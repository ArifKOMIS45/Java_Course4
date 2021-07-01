package gun56.Soru1;

public class Bus extends Vehicle implements IDeisel {

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bie depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "Duzgun sur dikkat et";
    }
}
