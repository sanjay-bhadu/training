package com.company;

public class Methodoverloading {
    static void foo()
    {
        System.out.println("hello Sanjay");
    }
    static void foo(int a)//here a is parameter.
    {
        System.out.println("hello Sanjay, value of a;"+a);
    }
    static void foo(int a,int b)
    {
        System.out.println("Hello Sanjay,value of a:"+a+" value of b:"+b);
    }
    //In method overlaoding we must have same type of return type.
    /* static int foo(int a,int b)
    {
    System.out.println("Hello World");
    }
     */
    public static void main(String[] args) {
        foo();
        foo(5);//Here a is arrgument.
        foo(6,7);
    }
}
