package Gun64;

public class Test5 {

    public static String doString(String s) {
        s = s.concat(" merhaba " + s);
        return s;
    }

    public static void main(String[] args) {
        String sb = "Hello";

        sb = doString(sb);
        System.out.println("sb = " + sb);
    }
}
