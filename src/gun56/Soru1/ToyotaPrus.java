package gun56.Soru1;

public class ToyotaPrus extends Vehicle implements IGas, IElectric {
    public ToyotaPrus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeOil() {
        return "30 lt benzinle 1000 km gider";
    }

    @Override
    public String drive() {
        return "Ilk 10 km elektrik kullanir";
    }

    @Override
    public String ChangeBattery() {
        return "Omur boyu degistormeden sur";
    }
}
