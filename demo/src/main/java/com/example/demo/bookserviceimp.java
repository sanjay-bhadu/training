package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
@Service
public class bookserviceimp implements Bookservice {
    ArrayList<Book> list;
    public bookserviceimp(){
        list =new ArrayList<>();
        Book b=new Book();
        b.setId(1);
        b.setBookName("Ramayan");
        b.setBookName("Valmiki");
        list.add(b);
    }
    @Override
    public ArrayList<Book> getBooks() {
        return list;
    }
    @Override
    public Book GetBook(Long i)
    {
        Book t=null;
        for(Book item:list)
        {
            if(i==item.getId())
            {
                t=item;
                break;
            }
        }
        return t;
    }
    @Override
    public void AddBook(Book b){
        this.list.add(b);
    }
    public void IssueBook(String s){
        int index=0;
        for(Book item:list){
            if(item.getBookName().equals(s))
                break;
            else
                index++;
        }
        this.list.remove(index);
    }
}
