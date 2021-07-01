package gun58.Ornek1;

class C {
    public C() {
        System.out.println("C ");
    }
}

class B extends C {
    public B() {
        //super(); super burda ama yazilmadanda goruyor
        // o yuzden ilk extend olanin constractri gorunuyor
        System.out.println("B ");
    }
}

class A extends B {
    public A() {
        //super(); var ama gorunmuyor
        System.out.println("A ");
    }
}


public class Ornek1 {
    public static void main(String[] args) {
        A a = new A();


    }

}
