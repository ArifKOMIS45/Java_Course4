package calismalar.sinifIci;

import java.util.Random;

public class Student extends StudentManager {
    private final String id;
    private String name;
    private int age;
    private double bakiye;

    public Student(String name, int age, double bakiye) {
        setName(name);
        setAge(age);
        setBakiye(bakiye);
        id = setId();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getId() {
        return id;
    }

    public String setId() {
        Random random = new Random(); //Math.random
        final String s = getName().charAt(0) + Integer.toString(random.nextInt(10000));
        return s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bakiye=" + bakiye +
                ", id='" + id + '\'' +
                '}';
    }
}
