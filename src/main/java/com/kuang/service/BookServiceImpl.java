package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;

import java.util.List;


public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

//    public BookMapper getBookMapper() {
//        return bookMapper;
//    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int editBook(Books books) {
        return bookMapper.editBook(books);
    }

    public int deleteBookByID(int id) {
        return bookMapper.deleteBookByID(id);
    }

    public Books queryBookId(int id) {
        return bookMapper.queryBookId(id);
    }

    public List<Books> queryAllBookS() {
        return bookMapper.queryAllBookS();
    }
}
