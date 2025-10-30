package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class UserDaoTest {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    UserDao userDao = sqlSession.getMapper(UserDao.class);

    @Test
    public void test() {
        //查询所有用户
        List<User> userList = userDao.getUserList();
//        for (User user : userList) {
//            System.out.println(user);
//        }
        sqlSession.close();
    }

    @Test
    public void getUserId() {
        User user = userDao.getUserById(1);
//        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
//    新增
    public void addUser() {
        int res = userDao.addUser(new User(13, "小王", "<EMAIL>", "18"));
        System.out.println(res+"陈工");
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
//    修改
    public void updateUser() {
        int res = userDao.updateUser(new User(13, "安理会是的", "<2222.com>", "28"));
        System.out.println(res+"陈工");
        sqlSession.commit();
        sqlSession.close();
     }
     @Test
//    删除
    public void deleteUser() {
        int res = userDao.deleteUser(13);
        System.out.println(res+"陈工");
        sqlSession.commit();
        sqlSession.close();
    }

}

