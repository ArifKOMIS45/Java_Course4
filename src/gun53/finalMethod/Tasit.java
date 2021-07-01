package gun53.finalMethod;

public class Tasit {
    private String Model;

    public Tasit(String model) {
        Model = model;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public final String toString() {
        return "Tasit{" +
                "Model='" + Model + '\'' +
                '}';
    }
}

