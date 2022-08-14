package com.service.impl;

import com.daomain.User;
import com.mapper.Loginmapper;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LoginService")
public class LoginServiceimpl implements LoginService {
    @Autowired
    Loginmapper loginmapper;
    @Override
    public User login(String username, String password) {
        return loginmapper.login(username, password);
    }
}
