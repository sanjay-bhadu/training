package com.company;

import java.util.Scanner;

public class recursion {
    static int recur(int n)
    {
        if(n==1 || n==0)
            return 1;
        else
            return n*recur(n-1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number you want to find the factorial of:");
        int n=in.nextInt();
        System.out.println(recur(n));
    }
}
