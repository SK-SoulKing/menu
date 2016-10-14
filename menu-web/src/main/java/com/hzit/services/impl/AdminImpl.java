package com.hzit.services.impl;

import com.hzit.dao.entity.Admin;
import com.hzit.dao.mapper.AdminMapper;
import com.hzit.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class AdminImpl implements AdminServices {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> findAll(Map map)  {

        return adminMapper.searchAdminByParams(map);
    }
}
