package com.company;

import java.util.Scanner;
//This is same as using struct but with some additional properties.
class Employee{
    int id;
    String Name;
    int salary;
    void getDetails()
    {
        System.out.println("My id is:"+id);
        System.out.println("My name is:"+Name);
    }
    int getSalary()// we can delcare many methods in the class;
    {
        return salary;
    }
        }
public class Custom_Class {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Employee n=new Employee();
        n.id=in.nextInt();
        n.Name=in.next();
        n.salary= in.nextInt();
        /*System.out.println(n.id);
        System.out.println(n.Name);*\

         */
        n.getDetails();//using this methods described in the class .. This helps in not repeat writing the code.
        int sal= n.getSalary();
        System.out.println(sal);
    }
}
