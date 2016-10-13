package com.hzit.controller;

import com.hzit.dao.entity.Module;
import com.hzit.services.ModuleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class ModuleController {

    @Autowired
    private ModuleServices moduleServices;

    @RequestMapping("/moduleall")
    //@ResponseBody
    public String ModuleAll(ModelMap modelMap){
        List<Module> list=moduleServices.findAll();
        modelMap.put("list",list);
        return "index";
    }

}
