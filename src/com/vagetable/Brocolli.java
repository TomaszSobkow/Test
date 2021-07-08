package com.vagetable;

public class Brocolli extends Vegetable{

    // private String name = "Brocoli";
     float price = 1.50f;

    public Brocolli(String name) {
        super(name);
    }



    @Override
     public void chop(){
        System.out.println("Brocoli Chop the "+ super.getName());
    }
}
