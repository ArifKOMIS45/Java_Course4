package Gun64;

public class Test {
    int a1;

    public static void doProduct(int a) {
        a = a * a; // 100
    }

    public static void doString(String s) {
        s.concat(" " + s);
    }

    public static void main(String[] args) {
        Test item = new Test();
        item.a1 = 11;

        String sb = "Hello";
        Integer i = 10;

        doProduct(i); // i nin değeri değişmez,
        doString(sb);

        doProduct(item.a1); // int tipi olduğundan int işlem görür değer değişmez

        System.out.println(i + " " + sb + " " + item.a1);// 10 Hello 11
    }
}