package gun62;

public class S16 {
    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].equals("B")) {
                    continue;
                }

                System.out.print(arr[i][j] + " ");
            }

            continue;
        }
    }
}
// A C D E