package com.fruit;

import com.cars.App;

public class Apple extends Fruit{

    public Apple(String name){
        super(name);
    }


    @Override
    public void mathodA() {
       // super.mathodA();
        System.out.println("methodA in class Apple");
        }

    @Override
    public void mathodB(){ System.out.println("Void methodB in class Apple"); }


    public static void eat(String s) {  Fruit.eat(); }



    public static void eat(){
        System.out.println(name);
    }


}
