package gun57.Ornek3;

public abstract class Food {
    public String name;

//    public Food() {
//    }
//
//    public Food(String name) {
//        this.name = name;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public abstract void madeIn();

    public abstract void taste();

    @Override
    public String toString() {
        madeIn();
        taste();
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
