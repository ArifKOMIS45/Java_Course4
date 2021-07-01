package gun61;

public class S56 {
    public static void main(String[] args) {
        String[] array = {"Thomas", "Peter", "Joseph"};
        String[] pwd = new String[3];

        int idx = 0;
        try {
            for (String n : array) {
                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;

            }
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            System.out.println("invalid name");
        }


    }
}
