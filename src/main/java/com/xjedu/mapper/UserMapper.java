package com.xjedu.mapper;

import com.xjedu.entity.UserEntity;

public interface UserMapper {
    int insert(UserEntity userEntity);//add
    int update(UserEntity userEntity);//edit
    int delete(UserEntity userEntity);//dele
    UserEntity select(UserEntity userEntity);



}
