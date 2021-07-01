package gun49.soru;

public class Arac {
    protected int model;
    private String renk;
    private int motor;

    public Arac(String renk, int motor, int model) {
        this.renk = renk;
        this.motor = motor;
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return
                "renk=" + renk +
                        ", motor=" + motor +
                        ", model=" + model;
    }
}
