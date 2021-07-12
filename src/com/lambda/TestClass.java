package com.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestClass {

    static ArrayList<Data> al = new ArrayList<>();
    public static void main(String[] args) {

        Data d = new Data(1);
            al.add(d);

            d = new Data(2);
            al.add(d);

            d = new Data(0);
            al.add(d);

        filterData(al, x -> x.value == 0);

        System.out.println("Data Array "+al);
    }

    public static void filterData(ArrayList list, Predicate<Data> test){
            

    }

    }


