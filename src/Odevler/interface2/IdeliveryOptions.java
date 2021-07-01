package Odevler.interface2;

import java.util.ArrayList;

public interface IdeliveryOptions {

    int AmazonMinFreeDelivery = 10000;
    int CostcoMinFreeDelivery = 15000;

    int getTheTotal(ArrayList<String> arraylist);

    String isFreeShipping(ArrayList<String> arraylist);
}
