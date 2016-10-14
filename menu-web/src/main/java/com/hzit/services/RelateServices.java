package com.hzit.services;

import com.hzit.dao.entity.Relate;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface RelateServices {
    List<Relate> findAll(Map map);
}
