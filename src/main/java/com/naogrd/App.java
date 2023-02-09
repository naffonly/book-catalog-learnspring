package com.naogrd;

import com.naogrd.Service.BookService;
import com.naogrd.domain.Author;
import com.naogrd.dto.BookDetailDTO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Author autho1r = new Author();
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
//        BookService bookService = (BookService) appContext.getBean("bookService");
//        BookDetailDTO bookDetailDTO = bookService.findBookDetailByid(2L);
//        System.out.println("book detail : " +bookDetailDTO);

        Author author = (Author) appContext.getBean("author");
        System.out.println(author);
    }
}
