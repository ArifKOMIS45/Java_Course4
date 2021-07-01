package Odevler.interface2;

import java.util.ArrayList;

public class Costco implements IdeliveryOptions {
    @Override
    public int getTheTotal(ArrayList<String> arraylist) {
        int total = 0;
        int a = 0;
        for (String eleman : arraylist) {
            if (eleman.toLowerCase().contains("k")) {
                a = Integer.parseInt(eleman.replaceAll("[^0-9]", ""));
                a = a * 1000;
                total += a;
            } else {
                a = Integer.parseInt(eleman.replaceAll("[^0-9]", ""));

                total += a;
            }
        }
        return total;
    }

    @Override
    public String isFreeShipping(ArrayList<String> arraylist) {
        String str = "";
        if (getTheTotal(arraylist) > CostcoMinFreeDelivery)
            return "you are eligible for free delivery";
        else str = String.valueOf(CostcoMinFreeDelivery - getTheTotal(arraylist));

        return "you need to buy " + str + " amount of item.";
    }
}
