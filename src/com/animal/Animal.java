package com.animal;

public abstract class Animal implements Mew {

    public void eat(){
        System.out.println("\t"+getClass().toString().substring(getClass().toString().lastIndexOf('.')+1)+  " eat!!");
    }

     public  int test;
}
