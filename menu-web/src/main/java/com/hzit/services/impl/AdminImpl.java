package com.hzit.services.impl;

import com.hzit.dao.entity.Admin;
import com.hzit.dao.mapper.AdminMapper;
import com.hzit.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public class AdminImpl implements AdminServices {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> findAll() {
        return adminMapper.searchAdminByParams(null);
    }
}
