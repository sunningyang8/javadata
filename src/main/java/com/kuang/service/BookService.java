package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books book);

    //    edit
    int editBook(Books book);

    //    dele
    int deleteBookByID(int id);

    //    query
    //    queryBookId
    Books queryBookId(int id);

    //querys
    List<Books> queryAllBookS();
}
