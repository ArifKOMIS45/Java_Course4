package gun63;

public class S152 {
    public static void main(String[] args) {

        int[][] n = {{1, 3}, {2, 4}}; // 2 satır x 2 sütün

        for (int i = n.length - 1; i >= 0; i--) { // 1 -> 0
            // 2,4 -> 1,3
            for (int y : n[i]) { // 2->4->1->3
                System.out.print(y);
                System.out.println();
            }
        }

    }
}