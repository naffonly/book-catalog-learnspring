package com.naogrd.RepositoryImpl;

import com.naogrd.Repository.BookRepository;
import com.naogrd.domain.Author;
import com.naogrd.domain.Book;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {

    private Map<Long,Book> bookMap;

//    public BookRepositoryImpl() {
//        super();
//        bookMap = new HashMap<Long, Book>();
//        Author author = new Author();
//        author.setId(1L);
//        author.setName("Naogrd");
//        author.setBirthdate(-16401);
//
//
//        Book book1 = new Book(author );
//        book1.setAuthor(author);
//        book1.setId(1L);
//        book1.setTitle("Titik Balik");
//        book1.setDecs("Titik Balik bekisah");
//
//        bookMap.put(book1.getId(), book1);
//    }

    public Map<Long, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<Long, Book> bookMap) {
        this.bookMap = bookMap;
    }

    @Override
    public Book findBookByid(Long id) {
        Book book = bookMap.get(id);
        return book;
    }
}
