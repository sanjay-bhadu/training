package com.example.demo;

import java.util.ArrayList;

public interface Bookservice {
    public ArrayList<Book> getBooks();

    public Book GetBook(Long i);
    public void AddBook(Book B);
    public void IssueBook(String s);
}
