package com.fruit;


import com.cars.App;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitApp {

    public static void main(String... args)  {
        Fruit f = new Apple("Gala");

        int [][][] in = new int[3][2][3];
        int [][] in2 = in[0];

//        in[0] = in2;
        System.out.println(in2.length);

        for(int a[][] : in){
            System.out.println("****************");
           for (int b[] : a) {
               System.out.println("----");
               for (int d : b)
                   System.out.print("\t"+d);
            }
        }
    }


}
