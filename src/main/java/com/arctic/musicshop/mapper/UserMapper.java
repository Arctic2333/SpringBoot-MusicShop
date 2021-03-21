package com.arctic.musicshop.mapper;

import com.arctic.musicshop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    int getPasswordByName(String username);

    User getUser(String username);
}
