package OCA_1;

public class oca_1 {


//    pdf 28

    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }


//   A) A B C D
//   B) A C D
//   C) A B C C ****
//   D) A B D
//   E) A B D C


}
