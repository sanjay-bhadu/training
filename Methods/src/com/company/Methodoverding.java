package com.company;
//method overriding means using of the same name method in child class .. for example..
class parent{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void sanjay()
    {
        System.out.println("Hello I am Sanjay from Parent Class");
    }
}
class child extends parent{
    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    //if we comment out below code when sanjay() is called it will be from parent, else it will be from child.
    public void sanjay()
    {
        System.out.println("Hello I am Sanjay form Child class");
    }
}
public class Methodoverding {
    public static void main(String[] args) {
        parent p= new parent();
        p.sanjay();
        child c= new child();
        c.sanjay();
    }
}
