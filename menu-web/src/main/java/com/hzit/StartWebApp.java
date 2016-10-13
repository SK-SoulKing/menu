package com.hzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/9/30.
 */
@SpringBootApplication
@ComponentScan({"com.fc","com.hzit.services.impl","com.hzit.controller"})
@MapperScan("com.hzit.dao.mapper")//扫描所有mapper接口
public class StartWebApp extends SpringBootServletInitializer {

}