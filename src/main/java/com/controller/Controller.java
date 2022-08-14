package com.controller;

import com.daomain.Message;
import com.daomain.User;
import com.mapper.Loginmapper;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class Controller {
    @Autowired
    Message message;
    @Autowired
    LoginService loginService;

    /**
     * 用户登录
     * @param username
     * @param password
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public Message test1(@RequestBody User user1, HttpServletRequest request){
        User user=loginService.login(user1.getUsername(), user1.getPassword());
        if(user==null){
            message.setStatuscode(0);
            message.setMsg("账号密码错误！");
        }else{
            // 检查邮箱是否激活
            if(user.getStatus().equals("待校验")){
                message.setStatuscode(-1);
                message.setMsg("邮箱待验证！");
            }else{
                message.setStatuscode(1);
                message.setMsg("登录成功！");
                request.getSession().setAttribute("user",user);
            }
        }
        return message;
    }
}
