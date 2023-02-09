package com.naogrd.BookServiceImpl;

import com.naogrd.Repository.BookRepository;
import com.naogrd.Service.BookService;
import com.naogrd.domain.Author;
import com.naogrd.domain.Book;
import com.naogrd.dto.BookDetailDTO;

public class BookServiceImpl implements BookService {
    private Book book;
    private BookRepository bookRepository;
//
//    public BookServiceImpl() {
//        Author author = new Author();
//        book = new Book(author);
//    }


    public BookServiceImpl(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDetailDTO findBookDetailByid(Long bookId) {
        Book book = bookRepository.findBookByid(bookId);
        BookDetailDTO dto  = new BookDetailDTO();
        dto.setBookId(book.getId());
        dto.setAuthorName(book.getAuthor().getName());
        dto.setBookTittle(book.getTitle());
        dto.setBookDecs(book.getDecs());

        return dto;
    }

//    public BookRepository getBookRepository() {
//        return bookRepository;
//    }
//
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
