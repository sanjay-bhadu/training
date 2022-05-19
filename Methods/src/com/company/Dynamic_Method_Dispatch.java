package com.company;
class Phone{
    public void Text(){
        System.out.println("Texting Ramesh");
    }
    public void Switch(){
        System.out.println("Hello, Phone is switching on");
    }
    public void Call(){
        System.out.println("Calling Ramesh");
    }
}
class Smartphone extends Phone{
    public void Game(){
        System.out.println("Opening Assassin Creed,Playing Assassin Creed");
    }
    public void Music(){
        System.out.println("Listening to Arijit Singh");
    }
    public void YouTube(){
        System.out.println("Watching Kobe Bean Bryant Highlights");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone Nokia =new Smartphone();//This is called Dynamic Method Dispatch
        // above one is legit
        //This is not legit
        //Smartphone Samsung =new Phone();
        //so we can say Super name= new Super/Child.
        Nokia.Switch();
        Nokia.Text();
        Nokia.Call();
        //Nokia.Game() we cannot use this as it is not from phone class.we can use only methods from Phone class.
        Smartphone Samsung= new Smartphone();
        Samsung.Switch();
        Samsung.Text();
        Samsung.Call();
        Samsung.Game();
        Samsung.Music();
        Samsung.YouTube();
    }
}
