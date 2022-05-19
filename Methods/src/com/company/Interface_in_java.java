package com.company;

import java.util.Scanner;

interface Bicycle{
    int speed=77;
    public void Brake(int d);
    public void Speedup(int a);
}
interface Cycle{
    void TurnLeft();
    void TurnRight();
}
//You can implement multiple interfaces in a class.. as with all interfaces you have to define all methods.
class Honda implements Bicycle,Cycle{
    @Override
    public void Brake(int d) {
        System.out.println("Car is Applying Brake");
        System.out.println(speed-d);
    }

    @Override
    public void Speedup(int a) {
        System.out.println("Car is Speeding up");
        System.out.println(speed+a);
    }

    @Override
    public void TurnLeft() {
        System.out.println("Car is Turning Left");
    }
    public void TurnRight(){
        System.out.println("Car is Turning Right");
    }
}
public class Interface_in_java {
    public static void main(String[] args) {
        Honda hero=new Honda();
        System.out.println("Speed of the Car:");
        //Properties in the Interface are variables or data type we define in it.
        //You can create new properties;
        System.out.println(Honda.speed);
        hero.Speedup(3);
        hero. Brake(4);
        hero.TurnLeft();
        hero.TurnRight();
        //You cannot modify the properties
        //hero.speed=744;
    }
}
