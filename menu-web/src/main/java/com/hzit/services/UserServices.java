package com.hzit.services;

import com.hzit.dao.entity.User;

/**
 * Created by Administrator on 2016/10/13.
 */

public interface UserServices {
    /**
     * 登录
     * @return
     */
    User findUser(String userName,String userPassword);
}
