package com.company;

import java.util.Scanner;

public class Main {
    static int addtion(int x,int y)
    {
        int z;
        if(x>y)
            return z=x+y;
        else
            return z=x*y;
    }
    public static void main(String[] args) {
        // Methods are same as function in c/c++.
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=addtion(a,b);
        System.out.println(c);
    }
}
