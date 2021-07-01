package gun56.Soru1;

public class Tesla extends Vehicle implements IElectric {
    public Tesla(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeBattery() {
        return "10 yilda bir batarya degistir.Batarya omru suan 80%";
    }

    @Override
    public String drive() {
        return "Auto pilot surebilirsin";
    }
}
