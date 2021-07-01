package Polymorphism._04_P;

public class anaYemekler extends yemekler {

    public anaYemekler(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getIsim() + " alabilir miyiz?";
    }

}
