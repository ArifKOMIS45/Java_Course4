package calismalar;

import java.util.Arrays;
import java.util.List;

public class calisma6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(
                list.stream().filter(a -> a > 3).filter(a -> a % 2 == 0).map(a -> a * 2).findFirst()
        );


    }
}
