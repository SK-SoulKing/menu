package com.hzit.services;

import com.hzit.dao.entity.Module;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface ModuleServices {
    List<Module> findAll(Map map);
}
