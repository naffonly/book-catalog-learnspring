package com.naogrd.Service;

import com.naogrd.dto.BookDetailDTO;

public interface BookService {
    public BookDetailDTO findBookDetailByid(Long bookId);
}
