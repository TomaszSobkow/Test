package com.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {

    public static void main(String[] args) {
        Cat cat = new Cat();
        //Animal animal = new Animal();
        Animal dog = new Dog();

        cat.eat();
       // animal.eat();
        dog.eat();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        //animals.add(new Animal());
        animals.add(new Dog());
        new AnimalFeeder().feed(animals);

        System.out.println("----------------------");
        Mew mew = new Cat();
        mew.meow();

        Mew mewq = (Mew) new Dog();
        mewq.meow();
        mew.voice();



    }
}
