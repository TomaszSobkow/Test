package com.exceptions;

public class ExceptionsTest {


    public static void main(String[] args) {

        try {
            new ExceptionsTest().second();

        }catch ( NullPointerException in){
            System.out.println("NullPointerException");

        }catch (IndexOutOfBoundsException n){
            System.out.println("Nul point exception");
        }finally {

        }

        new ExceptionsTest().someVoid();
    }

    public void someVoid(){
        StringBuilder sb =new StringBuilder();
        String st = (String)sb.toString();
        System.out.println(sb.getClass());
        sb.append("sdsdsdsdssd");

        byte[] btes = {2,1,2,2,2,22,2,2,2,21,1,2};
        String bytes = new String(btes, 1264);
        System.out.println("string from array "+ bytes);
    }



    public void second () {
        first("w");
    }

    public void first(String s) {
        throw new NullPointerException();
    }
}
