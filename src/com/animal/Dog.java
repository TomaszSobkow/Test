package com.animal;

public class Dog extends Animal{

    public void eat(){
        System.out.println("\tDog eat!!!");
    }

    @Override
    public void meow() {
        System.out.println("Dog buf buf!!");
    }
}
