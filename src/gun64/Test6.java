package Gun64;

import java.util.Arrays;

public class Test6 {

    public static void doDizi(int[] d) {
        d[0] = 100;
        d[1] = 200;
        d[2] = 300;
    }

    public static void main(String[] args) {
        int[] d = {0, 1, 2, 3, 4, 5};

        doDizi(d);
        System.out.println("d = " + Arrays.toString(d));
    }
}
