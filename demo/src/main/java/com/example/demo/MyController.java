package com.example.demo;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class MyController {
    @Autowired
    private Bookservice b;
    @GetMapping("/lib")
    public String Library(){
        return "This is Library";
    }
    // this is for storing books;
    @GetMapping("/available")
    public ArrayList<Book> getBooks(){
        return this.b.getBooks();
        }
        @GetMapping("/available/{book_id}")
    public Book GetBook(@PathVariable String book_id){
        return this.b.GetBook(Long.parseLong(book_id));
        }
        @PostMapping("/addbook")
    public void AddBook(@RequestBody Book te){
            this.b.AddBook(te);
        }
    @PostMapping("/issuebook/{bookname}")
    public void IssueBook(@PathVariable String bookname){
        this.b.IssueBook(bookname);
    }
}
