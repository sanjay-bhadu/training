package com.company;
//Here we take this as a base class.
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void alldetails()
    {
        System.out.println("All values in this are;" +this.getX());
    }
}
//this is derieved class which has all methods and attributes of the base class along with its own attributes.
// we use extends keyword for creating a child class
// there cannot be two parent class.
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void alldetails(){
        System.out.println("All values in this class are:"+this.getX());
        System.out.println(":"+this.getY());
    }
}
class derived2 extends derived{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public void alldetails(){
        System.out.println("All values in this class are:"+this.getX());
        System.out.println(":"+this.getY());
        System.out.println(":"+this.getZ());
    }
}
public class InheritanceinJava {
    public static void main(String[] args) {
        base b=new base();
        b.setX(4);
        derived d=new derived();
        d.setX(4);
        d.setY(5);
        derived2 d2 =new derived2();
        d2.setZ(6);
        d2.setX(4);
        d2.setY(5);
        b.alldetails();
        d.alldetails();
        d2.alldetails();
    }
}
