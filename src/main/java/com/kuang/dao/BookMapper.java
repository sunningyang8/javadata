package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //    add
     int addBook(Books book);

    //    edit
     int editBook(Books book);

    //    dele
     int deleteBookByID(@Param("bookID") int id);

    //    query
    //    queryBookId
     Books queryBookId(@Param("bookID") int id);

    //querys
     List<Books> queryAllBookS();
}
