package com.xjedu.test;


import com.xjedu.entity.UserEntity;
import com.xjedu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Mybatis {
    public static void main(String[] args) throws IOException {
        SqlSession session = null;
        try{
            String resource = "Mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//            创建sql
            session = sqlSessionFactory.openSession();
//            创建接口实例
            UserMapper mapper = session.getMapper(UserMapper.class);
//            创建userEntity实列
            UserEntity userEntity = new UserEntity();
//            插入
//            userEntity.setUsername("admin");
//            userEntity.setPassword("123456");
//            userEntity.setId(3);

//            修改
//            userEntity.setPassword("111");
//            userEntity.setUsername("张胜男");

//            删除
//            userEntity.setUsername("张胜男");
//            查询
            userEntity.setUsername("里斯");
//            操作
            UserEntity rusult = mapper.select(userEntity);

//            int i = mapper.select(userEntity)
//            判断插入是否成功
//            if(i>0){
//                System.out.println("插入成功"+i);
//            }else{
//                System.out.println("every");
//            }
//            session.commit();
            if(rusult!=null){
                System.out.println("yes");
                System.out.println(rusult.getPassword());
            }else{
                System.out.println("every");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
