package com.accesTest;

public class AccessTest {

    AccessTest(){
        System.out.println(new Inner().get());
    }


    String a = "x";
    static char b = 'x';
    String c = "x";

    public static void main(String[] args) {
        String mes = "message";
        System.out.println(mes.hashCode());

         mes = mes+" ";

        System.out.println(mes.hashCode());
    }

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

