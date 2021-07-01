package gun56.Soru1;

public class Vehicle {
    private String Model;
    private double engine;

    public Vehicle(String model, double engine) {
        Model = model;
        this.engine = engine;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Model='" + Model + '\'' +
                ", engine=" + engine +
                " " + this.getClass().getSimpleName() +
                '}';
    }
}
