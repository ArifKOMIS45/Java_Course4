package calismalar;

interface A {
    void show();
}
//class XYZ implements A{
//
//    @Override
//    public void show() {
//        System.out.println("Hello");
//    }
//}

public class calima12 {
    public static void main(String[] args) {
        A pbj;
        pbj = () -> {
            System.out.println("hello");
        };
        pbj.show();

    }


}
