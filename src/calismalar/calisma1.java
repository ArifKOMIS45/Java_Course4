package calismalar;

import java.util.Random;

public class calisma1 {
    public static void main(String[] args) {
        int b = (int) (Math.random() * 26 + 65);
        int c = (int) (Math.random() * 26 + 65);
        int d = (int) (Math.random() * 26 + 65);
        int e = (int) (Math.random() * 26 + 65);
        int f = (int) (Math.random() * 26 + 65);


        char b1 = (char) b;
        char c1 = (char) c;
        char d1 = (char) d;
        char e1 = (char) e;
        char f1 = (char) f;
        System.out.println("Kelime===" + b1 + "" + c1 + "" + d1 + "" + e1 + "" + f1);

        Random harf = new Random();
        System.out.print("kelime= ");
        for (int i = 0; i < 10; i++) {
            char ch = (char) (harf.nextInt(26) + 'a');
            System.out.print(ch);
        }


    }
}
