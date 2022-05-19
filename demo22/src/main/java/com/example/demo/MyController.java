package com.example.demo;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static java.lang.Long.parseLong;
@ResponseStatus
@ControllerAdvice
@RestController

public class MyController{
    Logger logger= LoggerFactory.getLogger(MyController.class);
    private Bookservice b;
    @GetMapping("/lib")
    public String Library(){
        logger.warn("Logged in Library");
        return "This is lib";
    }
    // this is for storing books;
    @GetMapping("/available")
    public ArrayList<Book> getBooks(){
        logger.info("Checked for list of books");
        return this.b.getBooks();
    }
    @GetMapping("/available/{book_id}")
    public ResponseEntity<?> GetBook(@PathVariable String book_id){
        logger.info("Checked for book with id no.");
        try{
            Book res=b.GetBook(Long.parseLong(book_id));
            return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
        }
        catch(Exception e){
            logger.warn("BOOK NOT FOUND");
            return new ResponseEntity<>("The book you required is not present",HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/add")
    public ResponseEntity<?> AddBook(@RequestBody Book te)  {
        try{
            Book res=this.b.AddBook(te);
            return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            logger.error("An Error occured");
            return new ResponseEntity<>("Book name is not present",HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/issue/{id}")
    public ResponseEntity<?> IssueBook(@PathVariable String id){
        try {
            this.b.IssueBook(Long.parseLong(id));
            return new ResponseEntity<>("Book is Successfully Issued", HttpStatus.ACCEPTED);
        }
        catch(Exception e){
            return new ResponseEntity<>("The Request Book is not available Currently",HttpStatus.BAD_REQUEST);
        }
    }


    @PutMapping("/Edit/{id}")
    public ResponseEntity<?> EditBook(@PathVariable String id,@RequestBody Book b)
    {
        try {
            this.b.EditBook(parseLong(id), b);
            return new ResponseEntity<>("The Book is Edited Successfully",HttpStatus.ACCEPTED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>("The id no. is not present in library",HttpStatus.BAD_REQUEST);
        }
    }
}
