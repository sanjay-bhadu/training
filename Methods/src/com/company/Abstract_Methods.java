package com.company;
//abstract class is class where abstract method is defined.
// A Abstract method is which is just defined without running code.
abstract class Smartphone1{
    abstract void Ring();//these are abstract classes.
    abstract void Switch();
    abstract void Game();
}
class Realme extends Smartphone1{
    void Ring(){
        System.out.println("Phone is Ringing");
    }
    void Switch(){
        System.out.println("Switching On, Realme");
    }
    void Game(){
        System.out.println("Snake Game");
    }

}
public class Abstract_Methods {
    public static void main(String[] args) {
        Realme r=new Realme();
        r.Switch();
        r.Ring();
        r.Game();


    }
}
