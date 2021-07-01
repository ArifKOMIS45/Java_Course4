package Polymorphism._04_P;

public class tatlilar extends yemekler {

    public tatlilar(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getIsim() + " alabilir miyiz?";
    }
}
