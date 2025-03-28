package com.xiaoliu.mapper;

import com.xiaoliu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User findLogin(@Param("username") String username, @Param("password") String password);

    int addUser(User user);

    User findUserByName(@Param("username") String username);

    int deleteUser(@Param("username") String username);
}
