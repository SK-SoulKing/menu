package com.hzit.services.impl;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class UserImpl implements UserServices {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     * @param userName
     * @param userPassword
     * @return
     */
    @Override
    public User findUser(String userName, String userPassword) {
        Map map=new HashMap();
        map.put("userName",userName);
        map.put("userPassword",userPassword);
        List<User> list=userMapper.searchUserByParams(map);
        if(list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }
}
