package com.hzit.controller;

import com.hzit.dao.entity.Module;
import com.hzit.dao.entity.Relate;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.UserVo;
import com.hzit.services.ModuleServices;
import com.hzit.services.RelateServices;
import com.hzit.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class UserController {
    @Autowired
    private UserServices userServices;
    @Autowired
    private RelateServices relateServices;
    @Autowired
    private ModuleServices moduleServices;

    @RequestMapping("/toindex")
    public String a(@RequestParam("userName") String userName,
                    @RequestParam("userPassword") String userPassword,HttpSession session){
        User user=userServices.findUser(userName,userPassword);
        if(user!=null){
            if(userName.equals(user.getUserName()) && userPassword.equals(user.getUserPassword())){
                UserVo u=new UserVo();
                u.setAdminId(user.getAdminId());
                u.setUserId(user.getUserId());
                u.setUserName(user.getUserName());
                u.setUserPassword(user.getUserPassword());
                u.setIsDel(user.getIsDel());
                Map m=new HashMap();
                    m.put("adminId",u.getAdminId());
                List<Relate> list=relateServices.findAll(m);
                List<Module> l=new ArrayList();
                for(Relate r:list){
                    Map mm=new HashMap();
                    mm.put("moduleId",r.getModuleId());
                    List<Module> ll=moduleServices.findAll(mm);
                    l.add(ll.get(0));
                }
                u.setModuleList(l);
                session.setAttribute("u",u);
                System.out.println(u.toString());
                return "index";
            }else {
                return "redirect:/index.html";
            }
        }else {
            return "redirect:/index.html";
        }
    }
}
