package com.vagetable;

public abstract class Vegetable {

    private  String name = "Vegetable";
    float price = 0.0f;

    public Vegetable(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }
    public  void setName(String name) {
        this.name = name;
    }

    public void chop(){
        System.out.println("Vegetable Chop the "+ getName());
    }
}
