package com.accesTest;

public class AccessTest {

    AccessTest(){
        System.out.println(new Inner().get());
    }


    String a = "x";
    static char b = 'x';
    String c = "x";

    class Inner{
        String a = "y";
        String get(){
            String c = "temp";
            c =  " "+AccessTest.b;
            c =  AccessTest.this.c;
            c = ""+b;
            System.out.println(b);
        return c;
        }
    }
}

