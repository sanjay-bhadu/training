package com.company.Project;
import java.util.*;
import java.util.Scanner;
class Book{
    private String Book_Name;
    private String Author_Name;

    public String getBook_Name() {
        return Book_Name;
    }

    public String getAuthor_Name() {
        return Author_Name;
    }

    public void setAuthor_Name(String author_Name) {
        Author_Name = author_Name;
    }

    public void setBook_Name(String book_Name) {
        Book_Name = book_Name;
    }
}
class Issue{
    private String Book_name;
    private String Issued_to;

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getIssued_to() {
        return Issued_to;
    }

    public void setIssued_to(String issued_to) {
        Issued_to = issued_to;
    }
}
class MyLibrary{
    ArrayList<Book> books;
    ArrayList<Issue> IssueList;
    public MyLibrary(ArrayList<Book> books,ArrayList<Issue> IssueList){
        this.books=books;
        this.IssueList=IssueList;
    }
    public void AddBook(Book book){
        this.books.add(book);
    }
    public void ReturnBook(Book book){
        int check=0;
        int index=0;
        for(Issue item: IssueList)
        {
            if(item.getBook_name().equals(book.getBook_Name()))
            {
                check=1;
                break;
            }
            index++;
        }
        if(check==1)
        {
            IssueList.remove(index);
            System.out.println("The book is added back");
            this.books.add(book);
        }
        else{
            System.out.println("This book is not added as it is not issued");
        }

    }
    public void IssueBook(String Naam2,String Naam){
        int check1=0;
        int index1=0;
        for (Book curr : books) {
            if (curr.getBook_Name().equals(Naam2)) {
                check1 = 1;
                break;
            }
            index1++;
        }
        if(check1==1)
        {
            Issue temp=new Issue();
            temp.setBook_name(Naam2);
            temp.setIssued_to(Naam);
            this.IssueList.add(temp);
            this.books.remove(index1);
        }
        else
        {
            System.out.println("The book is not present in the Library");
        }
    }
    public void IssueList(){
        System.out.println();
        System.out.println("These books are issued");
        System.out.println("Book Name              Issuer Name");
        for(int i=0;i<this.IssueList.size();i++){
            Issue curr=this.IssueList.get(i);
            System.out.println(curr.getBook_name()+"            "+curr.getIssued_to());
        }
    }
    public void AvailableBooks(){
        System.out.println();
        System.out.println("Available Books in Library");
        System.out.println("Book Name               Author Name");
        for(int j=0;j<this.books.size();j++){
           Book r=this.books.get(j);
            System.out.println(r.getBook_Name()+"              "+r.getAuthor_Name());
        }
    }
}
public class Library_Management {
    public static void main(String[] args) {
        ArrayList<Book> bk=new ArrayList<>();
        Book temp=new Book();
        temp.setBook_Name("Shrimad");
        temp.setAuthor_Name("ShriKrishna");
        bk.add(temp);
        temp.setBook_Name("Ramayan");
        temp.setAuthor_Name("Valmiki");
        bk.add(temp);
        ArrayList<Issue> is=new ArrayList<>();
        MyLibrary Library=new MyLibrary(bk,is);
        boolean l=true;
        while(l){
            int n=0;
            System.out.println();
            System.out.println("Press 1 for adding book in library");
            System.out.println("Press 2 for Issuing book in Library");
            System.out.println("Press 3 for Returning book in Library");
            System.out.println("Press 4 for Available books in Library");
            System.out.println("Press 5 for Issued books");
            System.out.println("Press 6 for Closing Programme");
            Scanner in=new Scanner(System.in);
            n=in.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Enter Book Name");
                    String BookName = in.next();
                    System.out.println("Enter Author Name");
                    String AuthorName = in.next();
                    Book temp2 = new Book();
                    temp.setAuthor_Name(AuthorName);
                    temp.setBook_Name(BookName);
                    Library.AddBook(temp2);
                }
                case 2 -> {
                    System.out.println("Enter Book Name");
                    String Bookname = in.next();
                    System.out.println("Enter Issuer Name");
                    String Issuer = in.next();
                    Library.IssueBook(Bookname, Issuer);
                }
                case 3 -> {
                    System.out.println("Enter Book Name");
                    String a = in.next();
                    System.out.println("Enter Author Name");
                    String b = in.next();
                    Book c = new Book();
                    c.setBook_Name(a);
                    c.setAuthor_Name(b);
                    Library.ReturnBook(c);
                }
                case 4 -> Library.AvailableBooks();
                case 5 -> Library.IssueList();
                case 6 -> l = false;
                default -> System.out.println("Invalid!!");
            }
        }
    }
}
