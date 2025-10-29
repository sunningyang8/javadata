package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory qlSessionFactory;
    static{
        try{
            String resource = "Mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            qlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return qlSessionFactory.openSession();
    }
}
