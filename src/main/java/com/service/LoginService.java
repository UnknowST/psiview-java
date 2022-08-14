package com.service;

import com.daomain.User;

public interface LoginService {
    /** 用户登录
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);
}
