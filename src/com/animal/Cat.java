package com.animal;

public class Cat extends Animal {



    @Override
    public void eat(){
        System.out.println("\tCate eat!!");
    }

    @Override
    public void meow(){
        System.out.println("\t"+getClass().toString().substring(getClass().toString().lastIndexOf('.')+1)+ " meow!!!");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println(getClass().toString().substring(getClass().toString().lastIndexOf('.')+1));
    }
}
