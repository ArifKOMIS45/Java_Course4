package gun57.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil() {//bos constructor
    }

    public Sekil(String name) {
        this.name = name;
    }

    abstract double alan();

    abstract double cevre();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ciz() {
        System.out.println(name + " sekli cizildi");
    }


    @Override
    public String toString() {
        return "Sekil {" +
                "name=" + name + " , " +
                "Cevre=" + Math.round(cevre()) + "  , " +
                "Alan=" + Math.round(alan()) +
                '}';
    }
}
