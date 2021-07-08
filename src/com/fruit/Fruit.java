package com.fruit;

public class Fruit {

 static String name;

    public Fruit(String name){
        Fruit.name = name;
    }

    public static void eat(){ System.out.println("Static eat -> "+name); }
    public static void eat(String s){  System.out.println("instance method in Fruit -> "+s+"--"+name); }

     public void mathodA(){ System.out.println("Void methodA in class Fruit"); }
    public void mathodB(){ System.out.println("Void methodB in class Fruit"); }


}
