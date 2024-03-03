package com.example.demoh2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private Integer pages;
    private String author;
    private String family;

    public Book() {

    }

    public Book( Integer id ,String title, Integer pages, String author, String family) {
       this.id = id;
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.family = family;
    }
}
