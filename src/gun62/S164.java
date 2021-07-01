package gun62;

public class S164 {
    public static void main(String[] args) {

        int[] data = {2010, 2013, 2014, 2015, 2014};
        int key = 2015;
        int count = 0;

        for (int e : data) {
            if (e != 2015) {
                count++; // 1 2 3 4
                continue;
            }

            System.out.println(count + " Found");
        }


    }
}

// 3 Found