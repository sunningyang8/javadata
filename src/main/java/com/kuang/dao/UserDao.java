package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserDao {
//    查询
    List<User> getUserList();
//    查询用户
    User getUserById(int id);
//    新增
    int addUser(User user);
//    修改、
    int updateUser(User user);
//    删除
    int deleteUser(int id);
}
