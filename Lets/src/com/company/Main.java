package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean game=true;
        while(game) {
            System.out.println("Lets Play game of rock paper and scissor");
            System.out.println("Enter Your choice");
            Scanner in = new Scanner(System.in);
            String userchoice = "ram";
            boolean ent = true;
            while (ent) {
                userchoice = in.nextLine();
                if (userchoice.equals("rock") || userchoice.equals("paper") || userchoice.equals("scissor"))
                    ent = false;
                else
                    System.out.println("invalid input, Please try to input again");
            }
            Random rand = new Random();
            int num = rand.nextInt(3);
            String auto = "Hey";
            if (num == 0)
                auto = "rock";
            else if (num == 1)
                auto = "paper";
            else
                auto = "scissor";
            System.out.println("User choice:" + userchoice);
            System.out.println("Cpu choice:" + auto);
            if (userchoice.equals(auto))
                System.out.println("It's a tie");
            else {
                if (userchoice.equals("rock")) {
                    if (auto.equals("paper"))
                        System.out.println("you lose");
                    else
                        System.out.println("you win");
                } else if (userchoice.equals("paper")) {
                    if (auto.equals("scissor"))
                        System.out.println("you lose");
                    else
                        System.out.println("you win");
                } else {
                    if (auto.equals("rock"))
                        System.out.println("you lose");
                    else
                        System.out.println("you win");
                }
            }
            System.out.println("do you want to play again");
            System.out.println("press y for yes and n for no");
            char c=in.next().charAt(0);
            if(c=='n')
                game=false;

        }
    }
}
