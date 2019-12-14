package com.yang.bms.service;

import com.yang.bms.pojo.Book;

import java.util.List;

public interface BookService {

    void addBook();
    List<Book> allBook();
    void borrowBook(String userId,String bookId);

}
