package calismalar;


class Product {
    double price;

}

class Test {
    public void updatePrice(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;

    }

}

public class calisma4 {
    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newprice = 100;

        Test t = new Test();
        t.updatePrice(prt, newprice);
        System.out.println(prt.price + ":" + newprice);


    }
}
