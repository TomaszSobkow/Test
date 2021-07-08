package com.vagetable;

public class Carrot extends Brocolli{

   // static String name = "Carrot";


    public Carrot(String name) {
        super(name);
    }

    public  String getName() { return super.getName(); }
    public  void setName(String name) { name = name; }

    @Override
    public void chop() {
        System.out.println("Carrot Pilling "+ getName());
    }
}
