package Odevler.odevEncapsulation4;

public class Emplyees {

    private String name;
    private int salary;
    private String dob;

    public Emplyees(String name, int salary, String dob) {
        setName(name);
        setSalary(salary);
        setDob(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
        ageCalculator();
    }

    public void ageCalculator() {
        String yas = dob.substring(dob.length() - 4);
        int yas1 = 2021 - Integer.parseInt(yas);
        if (yas1 > 18) System.out.println("Welcome to our company " + getName() + " your salary is " + getSalary());
        if (yas1 == 18)
            System.out.println("We can have inter with you after that you can have a  " + getSalary() + " salary");
        if (yas1 < 18) System.out.println("come back when you are 18 years old");
    }
}
