package com.company;
import java.util.Scanner;
// constructor will run automatically when class in used.. they can be created by using method of same name as class.

class employee{
    int id;
    String name;
    public employee(int n,String r){// we can pass arguments in the constructors.
        id =n;
        name=r;
    }
    // we can also perform overloading in constructors.
    //ex.
    public employee(String n)
    {
        id=1;
        name=n;
    }
    public employee()
    {
        id=23;
        name="Sanjay Bhadu";
    }

    public void getdetails()
    {
        System.out.println("Employee details are as follows:");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}
public class ConstructorsinJava {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        employee John=new employee(23,"John Wick");
        employee Raaj=new employee("Raaj");
        employee Sanjay=new employee();
        John.getdetails();
        Raaj.getdetails();
        Sanjay.getdetails();
    }
}
