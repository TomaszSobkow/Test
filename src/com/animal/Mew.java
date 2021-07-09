package com.animal;

public interface Mew {
    void meow();
    int test = 12;
    default void voice(){
        System.out.print("Voice from ");
    }
}
