package gun62.HashSet_LinkedHashSet_TreeSet.Hashset_Day2;

public class hs_02 {
    public static void main(String[] args) {

        // todo      Hashset, TreeSet ve LinkedHashSet oluşturunuz ve yazdırınız.
        //                Elemanları ismi generateNumbers olan, return type'ı ise Arraylist olan bir methoddan alınız.
        //                     [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]

        //   List<Integer> list = Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6);
        ArrayList<Integer> list = generateNumbers();

        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println("HashSet: " + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println("TreeSet: " + treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }

    private static ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> result = new ArrayList<>();
        int[] numbers = {1, 6, 33, 15, 22, 7, 8, 4, 3, 6};
        for (int number : numbers) {
            result.add(number);
        }
        return result;
    }
}
