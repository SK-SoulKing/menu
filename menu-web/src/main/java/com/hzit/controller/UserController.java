package com.hzit.controller;

import com.hzit.dao.entity.User;
import com.hzit.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class UserController {
    @Autowired
    private UserServices userServices;

    @RequestMapping("/toindex")
    public String a(@RequestParam("userName") String userName,
                    @RequestParam("userPassword") String userPassword,HttpSession session){
        if("".equals(userName)||"".equals(userPassword)){
            return "redirect:/index.html";
        }
        User user=userServices.findUser(userName,userPassword);
        if(user!=null){
            session.setAttribute("user",user);
            return "index";
        }else {
            return "redirect:/index.html";
        }
    }
}
