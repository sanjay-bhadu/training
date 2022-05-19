package com.example.demo;

import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public interface Bookservice {
    public ArrayList<Book> getBooks();

    public Book GetBook(Long i);
    public Book AddBook(Book B) throws Exception;
    public void IssueBook(Long id);
    public void EditBook(Long i, Book b);
}