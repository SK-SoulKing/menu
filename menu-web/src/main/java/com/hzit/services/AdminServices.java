package com.hzit.services;

import com.hzit.dao.entity.Admin;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface AdminServices {
    List<Admin> findAll(Map map);
}
