package com.hzit.services.impl;


import com.hzit.dao.entity.Module;
import com.hzit.dao.mapper.ModuleMapper;
import com.hzit.services.ModuleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class ModuleImpl implements ModuleServices {

    @Autowired
    private ModuleMapper moduleMapper;

    @Override
    public List<Module> findAll() {
    return moduleMapper.searchModuleByParams(null);
    }
}
