package com.vagetable;

public class App {

    public static void main(String[] args) {
        Vegetable v = new Brocolli("Brocoli");
        Vegetable carrot = new Carrot("Carrot");

        System.out.println(v.getName());
        System.out.println(carrot.getName());

        v.chop();
        carrot.chop();
    }


}
