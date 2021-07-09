package com.testy;

import java.util.ArrayList;
import java.util.List;

public class Test {

    int i;
//    public Test(){
//        System.out.println("Default constructor in Test");
//    }
//
    public Test(int x){
        this.i =x;
        System.out.println("1. in class Test one parameter constructor");
    }

    static int[][][] array = { { {1,2,3,4,5} , {11,22,33,44} },{ {33,33,33,3,},{44,44,44,44} } };
    static int [][][] array2 = new int[4][1][1];
    static int[][] array3 = {{0,1},{11,12}};

    public static void main(String[] args) {
        System.out.println('b'+1);

        System.out.println("***********" + array3[0][1]);
       // checkMemort();
        System.out.println("lenght"+array.length);



        for ( int[][] a : array ) {
            for (int[] b: a ){
                System.out.println();
                for (int c : b){
                    System.out.print(c);
                }
            }
            System.out.println("---");
        }

        System.out.println("--------------------------");

        for(int[] a : array3)
            for (int b : a)
                System.out.println(b);

    }

    static void checkMemort(){
        List s1 = new ArrayList( );
        try{  while(true){
            s1.add("sdfa");  }
        }catch(RuntimeException e){  e.printStackTrace();   }
        System.out.println(s1.size());
    }
}
