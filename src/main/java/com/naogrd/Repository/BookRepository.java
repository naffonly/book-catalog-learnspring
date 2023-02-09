package com.naogrd.Repository;

import com.naogrd.domain.Book;

public interface BookRepository {

    public Book findBookByid(Long id);
}
