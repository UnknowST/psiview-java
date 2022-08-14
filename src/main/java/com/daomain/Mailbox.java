package com.daomain;

import org.springframework.stereotype.Component;

@Component
public class Mailbox {
    String num,username,email,code;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Mailbox{" +
                "num='" + num + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
