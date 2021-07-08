package com.testy;

public class Test2 extends Test{

    int i;

    public Test2(int x, int y ){
        super(x);
        this.i = y;
        System.out.println("2. in Class Test2 two parameters constructor");
    }

//    public Test2(int x){
//        super(x*2);
//        this.i = x;
//    }

    public Test2(int z){
        this(z,z);
        System.out.println("3. In class Test2 one parameter constructor");
    }

}
