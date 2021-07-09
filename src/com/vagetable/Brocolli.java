package com.vagetable;

public class Brocolli extends Carrot{

    public Brocolli(String name) {
        super(name);
    }

    @Override
    void abstr() {
        super.abstr();
    }

    @Override
     public void chop(){
        System.out.println("Brocoli Chop the "+ super.getName());
    }
}
