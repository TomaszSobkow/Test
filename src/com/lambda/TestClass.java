package com.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class TestClass {

    static ArrayList<Data> al = new ArrayList<>();
    static String j = "";

    private TestClass(int x){

    }


    public static void main(String[] args) {

        TestClass testClass = new TestClass(12);

        MyFilter myFilter = new MyFilter(2);
        //myFilter.value =12;

        Data d = new Data(1);
            al.add(d);

            d = new Data(2);
            al.add(d);


            d = new Data(0);
            al.add(d);

        d = new Data(0);
        al.add(d);

        filterData(al, x -> x.value == 0);

        System.out.println("Data Array "+al.size());

        method(1);
        method(2);
        System.out.println(j);

    }

    public static void method( int i){
        try{    if(i == 2){
            throw new Exception();
        }
            j += "1";
        } catch (Exception e){
            j += "2";
            return;
        }   finally{
            j += "3";
        }

        j += "4";

    }

    public static void filterData(ArrayList<Data> list, Predicate<Data> t){
        list.removeIf(t);
        }
}