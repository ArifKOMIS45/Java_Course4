package gun53.finalClass;

final class Tasit {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tasit{" +
                "model='" + model + '\'' +
                '}';
    }
}
