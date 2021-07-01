package Polymorphism._03_P;

public class Ornek { //super class

    int x = 10;

}

class Ornek_1 extends Ornek {    //extend ettiğimiz class'ın özelliklerini miras alır.

    int x = 20;                 // Bu iki x birbirinden farklı.

}

class Test {
    public static void main(String[] args) {

        Ornek a = new Ornek_1();
        System.out.println(a.x);

        Ornek_1 b = new Ornek_1();
        System.out.println(b.x);


    }
}
