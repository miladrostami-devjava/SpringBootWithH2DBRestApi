package com.example.demoh2.controller;


import com.example.demoh2.model.Book;
import com.example.demoh2.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books/")
public class BookController {

private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @GetMapping
    public Iterable<Book> getAllBook(){
        return bookRepository.findAll();
    }
}
