package com.testy;

public class A extends Abstract{



    public A(int a){ super(a);  }
    public A(){super();}
   //  int[] array4[] = new int[5][2];

    public static void main(String[] args) {
        int [][][] aray = new int [4][][];
        aray[0] = new int[3][];
        aray[1] = new int[22][];
        aray[2] = new int[11][];
        aray[3] = new int[44][];

        aray[0][0] = new int[3];
        aray[0][1] = new int[1];
        aray[0][2] = new int[2];

        aray[0][0][0] = 11;
        aray[0][0][1] = 22;
        aray[0][0][2] = 33;
        aray[0][0][3] = 22;


//        aray[0][1] = new int[2];
//        aray[0][2] = new int[4];




        System.out.println("array4 length "+aray[0][0].length+"\narray5 length ");
        System.out.println(new A());

        switch (i()){
            case 1: {
                System.out.println("one  switch");
            }
            break;
            case 2: {
                System.out.println("two switch"); break; }
        }
    }

    static int i(){
        return 2;
    }



   public String print(Integer I) throws IndexOutOfBoundsException{
       return "in class A";
   }

}
