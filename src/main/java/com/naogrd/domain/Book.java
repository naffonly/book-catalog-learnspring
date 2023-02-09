package com.naogrd.domain;

import java.io.Serializable;

public class Book implements Serializable {
    private Long id;
    private String title;
    private String decs;


    private Author author;

    public Book(Author author) {
        super();
        this.author = author;
    }

    public Book() {
        super();
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }
}
