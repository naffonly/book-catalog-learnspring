package com.naogrd.dto;

import java.io.Serializable;

public class BookDetailDTO implements Serializable {
    private Long bookId;
    private String authorName;
    private String bookTittle;
    private String bookDecs;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public String getBookDecs() {
        return bookDecs;
    }

    public void setBookDecs(String bookDecs) {
        this.bookDecs = bookDecs;
    }

    @Override
    public String toString() {
        return "BookDetailDTO{" +
                "bookId=" + bookId +
                ", authorName='" + authorName + '\'' +
                ", bookTittle='" + bookTittle + '\'' +
                ", bookDecs='" + bookDecs + '\'' +
                '}';
    }
}
