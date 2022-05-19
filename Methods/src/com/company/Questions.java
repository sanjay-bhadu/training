package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    private int g;
    int user;
    int guess;
    public void userinput(){
        Scanner n=new Scanner(System.in);
        user=n.nextInt();
        if(user>g)
            System.out.println("print smaller number");
        if(user<g)
            System.out.println("print greater number");
    }
    public Game(int bound){
        Random r=new Random();
        int ans=r.nextInt(bound);
        g=ans;
        guess=1;
    }
   public boolean isequal(){
        if(g==user)
            return true;
        else
            return false;
    }
    public void setguess(){
        guess++;
    }
    public void getguess()
    {
        System.out.println("Number of guess: "+guess);
    }


}
public class Questions {
    public static void main(String[] args) {
        Game game=new Game(100);
        game.userinput();
        while(!game.isequal())
        {
            game.setguess();
            game.userinput();
        }
        game.getguess();
    }
}
