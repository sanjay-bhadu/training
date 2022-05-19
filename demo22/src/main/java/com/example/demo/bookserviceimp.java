package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
@Service
public class bookserviceimp implements Bookservice {
    ArrayList<Book> list;
    public bookserviceimp(){
        list =new ArrayList<>();
        Book b=new Book();
        b.setId(1);
        b.setBookName("Ramayan");
        b.setAuthorName("Valmiki");
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
        int r=0;
        for(Book item:list)
        {
            if(i==item.getId())
            {
                t=item;
                r=1;
                break;
            }
        }
        if(r==1)
        return t;
        else
            throw new RuntimeException();
    }
    @Override
    public Book AddBook(Book b){
        if(b.getBookName().equals(null)) {
            throw new RuntimeException();
        }
        else if(b.getBookName().equals(null))
            throw new RuntimeException();
        else{
            this.list.add(b);
            return b;
        }
    }
    public void IssueBook(Long id){
        int index=0;
        int p=0;
        for(Book item:list){
            if(item.getId()==id){
                p=1;
                break;}
            else
                index++;
        }
        if(p==1)
        this.list.remove(index);
        else
            throw new RuntimeException();
    }

    @Override
    public void EditBook(Long i, Book b) {
        int r = 0;
        for (Book item : list)
            if (item.getId() == i) {
                item.setAuthorName(b.getAuthorName());
                item.setBookName(b.getBookName());
                r = 1;
                break;}
        if(r==0)
        {
            throw new RuntimeException();
        }
    }
}

