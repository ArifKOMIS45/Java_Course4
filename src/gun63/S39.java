package gun63;

public class S39 {
    public static void main(String[] args) {
        String[][] shirts = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        for (String[] satir : shirts) {
            for (String s : satir) {
                System.out.print(s + ":");
            }
        }

    }
}
