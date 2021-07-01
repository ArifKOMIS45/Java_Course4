package Gun64;

public class Test4 {

    public static void doString(String s) {
        s = s.concat(" merhaba " + s);
        System.out.println("metod içi s = " + s);
    }

    public static void main(String[] args) {
        String sb = "Hello";

        doString(sb); // maindeki değer değişmez çünkü kendisi gitmiyor
        System.out.println("sb = " + sb);


    }
}
