package com.company;
class Library{
    String [] Book=new String[100];
    int i=0;
    Library(String s){
        i=0;
        Book[i]=s;
        i++;
    }
    public void AddBook(String S){
        if(i==100)
        {
            System.out.println("Library Full");
        }
        else{
            Book[i]=S;
            i++;
        }
    }
    public String IssueBook(){
        if(i<=0)
            return "Empty Library";
        else{
        i--;
        String temp=Book[i];
        return temp;}
    }
    public void ReturnBook(String s){
        if(i==100)
        {
            System.out.println("Sorry Sir there is no space left");
        }
        else{
        Book[i]=s;
        i++;}

    }
    public int RamainingBooks(){
        return i;
    }
}
public class Library_Question {
    public static void main(String[] args) {
        Library NITA=new Library("Tale");
        NITA.AddBook("Ramanyan");
        NITA.AddBook("Mahabharat");
        NITA.AddBook("Bhagwat Gita");
        System.out.println(NITA.RamainingBooks());
        System.out.println(NITA.IssueBook());
        System.out.println(NITA.IssueBook());
        System.out.println(NITA.IssueBook());
        System.out.println(NITA.IssueBook());
        NITA.AddBook("Shiv Puran");
        NITA.ReturnBook("Ramayan");
        System.out.println(NITA.RamainingBooks());
        System.out.println(NITA.IssueBook());

    }
}
