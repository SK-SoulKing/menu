package com.hzit.services.impl;

import com.hzit.dao.entity.Relate;
import com.hzit.dao.mapper.RelateMapper;
import com.hzit.services.RelateServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public class RelateImpl implements RelateServices {

    @Autowired
    private RelateMapper relateMapper;

    @Override
    public List<Relate> findAll() {
        return relateMapper.searchRelateByParams(null);
    }
}
