package com.company;
import java.util.Scanner;
// for change in private modifiers.. we use getter and setter ..
class employe{
    private int id;
    private String name;
    public void setId(int n){
        id=n;
    }
    public int getId(){
        return id;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }

}
public class AccessMOdifiers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        employe John=new employe();
        System.out.println("Enter the name of the employee");
        String nam=in.nextLine();
        John.setName(nam);
        System.out.println("Enter the id number");
        int num=in.nextInt();
        John.setId(num);
        System.out.println(John.getName());
        System.out.println(John.getId());

    }
}
