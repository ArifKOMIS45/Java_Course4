package Polymorphism._04_P;

public class salatalar extends yemekler {


    public salatalar(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getIsim() + " alabilir miyiz?";
    }
}
