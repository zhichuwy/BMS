package com.yang.bms.service.impl;

import com.yang.bms.pojo.Book;
import com.yang.bms.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void addBook() {

    }

    @Override
    public List<Book> allBook() {
        return null;
    }

    @Override
    public void borrowBook(String userId, String bookId) {

    }
}
