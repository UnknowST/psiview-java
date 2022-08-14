package com.mapper;

import com.daomain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Loginmapper {
    /** 用户登录
     * @param username
     * @param password
     * @return
     */
    User login(@Param("username") String username,@Param("password") String password);
}
