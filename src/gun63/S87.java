package gun63;

public class S87 {
    public static void main(String[] args) {

        int[][] n = {{1, 3}, {2, 4}};

        for (int i = n.length - 1; i >= 0; i--) { // 1 -> 0
            for (int j = n.length - 1; j >= 0; j--) { // 1-> 0
                System.out.print(n[i][j]);
                // 11 -> 4
                // 10 -> 2
                // 01 -> 3
                // 00 -> 1

            }
        }

    }
}
