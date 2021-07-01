package Gun64;

public class Test2 {
    int a1;

    public static void doProduct(int a) {
        a = a * a; // 25 burada
        System.out.println("metod içi a = " + a);
    }

    public static void main(String[] args) {
        int a = 5; // hafızada Integer kadar yer kaplamıyor.
        doProduct(a); // a nın değeri ? anın değeri değişmez a=5
        System.out.println("a = " + a);
        String strA = String.valueOf(a);


        Integer b = 5; // hafızada daha fazla yer kaplıyor
        doProduct(b); // b nin değeri ? b=5 değişmez
        System.out.println("b = " + b);
        String strB = b.toString();
    }
}
