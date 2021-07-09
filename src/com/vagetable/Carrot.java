package com.vagetable;

public class Carrot extends Vegetable{

    public Carrot(String name) {
        super(name);
    }

    @Override
    public void chop() {
        System.out.println("Carrot Pilling "+ getName());
    }

    @Override
    void abstr() {

    }
}
