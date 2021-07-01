package Odevler.odevEncapsulation3;

public class Student {
    private String name;
    private int yas;

    public Student(String name, int yas) {
        setName(name);
        setYas(yas);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("\"Student name is " + name + ".\" ");
        this.name = name;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        System.out.println("\"He is " + yas + " years old.\"");
        this.yas = yas;
    }
}
