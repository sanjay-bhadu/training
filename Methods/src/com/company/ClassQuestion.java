package com.company;

import java.util.Scanner;

class square{
    int side;
    int area(){
        return side*side;
    }
    int perimeter()
    {
        return 4*side;
    }
    int getside()
    {
        return side;
    }
}
public class ClassQuestion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the side of Square");
        square n=new square();
        n.side=in.nextInt();
        int area=n.area();
        System.out.println("Area:"+area);
        int peri=n.perimeter();
        System.out.println("Perimeter:"+peri);
        int side=n.getside();
        System.out.println("Side:"+side);
    }
}
