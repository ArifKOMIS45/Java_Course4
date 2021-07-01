package OCA_1;

public class oca_8 {

    char c;
    boolean b;
    float f;
    byte by;        //primitiv dataTypes
    int i;
    long l;
    double d;
    String s;
    short sh;

    Character a1;
    Boolean a2;
    Float a3;
    Byte a4;        // Wrapper Classlar
    Integer a5;
    Long a6;
    Double a7;
    Short a8;

    public static void main(String[] args) {

        oca_8 o8 = new oca_8();
        o8.printAll();

    }

    void printAll() {
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("by = " + by);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("d = " + d);
        System.out.println("s = " + s);
        System.out.println("sh = " + sh);
        System.out.println("------------------------------------");
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a4 = " + a4);
        System.out.println("a5 = " + a5);
        System.out.println("a6 = " + a6);
        System.out.println("a7 = " + a7);
        System.out.println("a8 = " + a8);
    }

    /*

    A)  c =
        b = false
        f = 0.0

    B)  c =
        b = true
        f = 0.0

    C)  c = 0
        b = false
        f = 0.0f

    D)  c =
        b = false
        f = 0.0F

     */


}
