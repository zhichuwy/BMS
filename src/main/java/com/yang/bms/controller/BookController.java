package com.yang.bms.controller;


import com.yang.bms.pojo.Book;
import com.yang.bms.service.impl.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class BookController {

    private BookServiceImpl bookService;


    @RequestMapping("/")
    public String index(Model model) {

        List<Book> bookList=new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Book book=new Book();
            book.setBookId("bId00"+i);
            book.setBookName("bName"+i);
            book.setAuthor("bAuthor"+i);
            bookList.add(book);
        }

        model.addAttribute("bookList",bookList);
        return "index";
    }


    @RequestMapping("/addBook")
    @ResponseBody
    public String addBook(){
        return "add successfully";
    }

    @RequestMapping("/allBook")
    @ResponseBody
    public List<Book> allBook(){

        List<Book> list=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Book book=new Book();
            book.setBookId("bId00"+i);
            book.setBookName("bName"+i);
            book.setAuthor("bAuthor"+i);
            list.add(book);
        }

        return list;
    }

}
