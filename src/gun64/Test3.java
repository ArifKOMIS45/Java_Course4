package Gun64;

public class Test3 {
    int a1;

    public static int doProduct(int a) {
        a = a * a; // 25 burada
        // System.out.println("metod içi a = " + a);
        return a;
    }

    public static void main(String[] args) {
        int a = 5; // hafızada Integer kadar yer kaplamıyor.
        a = doProduct(a); // a nın değeri ? anın değeri değişmez a=5
        System.out.println("a = " + a);


        Integer b = 5; // hafızada daha fazla yer kaplıyor
        b = doProduct(b); // b nin değeri ? b=5 değişmez
        System.out.println("b = " + b);
    }
}
