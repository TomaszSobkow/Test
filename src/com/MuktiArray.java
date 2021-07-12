package com;

public class MuktiArray {




    public static void main(String[] args) {

        testloop();

        short d = 12;
        int w = 12;
        Integer i = 32;
        double q = 32;


        Float f=11.0f;
        Double dou = 13d;

        System.out.println( dou == w);


//        int value = 0;
//        int number = 1;
//
//        int[][] array = new int[5][4];
//
//        for (int index = 0; index < array.length; index++){
//            System.out.println(number++ + " ---------------");
//            for (int index2 = 0; index2 < array[index].length; index2++){
//                array[index][index2] = value++;
//                System.out.println("["+index+"]" + "["+index2+"]" + "\t"+array[index][index2]);
//            }
//
//
//        }
//        //System.out.println(array[0][0]);

    }

    static void testloop(){
        int i =1;
        do{
            System.out.println("looptest "+i);
        }while (i++<2);
        testloop2();
    }

    static void testloop2(){
        for (int i =1; i<2;++i) System.out.println("\ntestloop "+i);
    }

}
