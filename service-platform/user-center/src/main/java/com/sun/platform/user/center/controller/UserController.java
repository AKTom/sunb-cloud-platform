package com.sun.platform.user.center.controller;

import com.sun.platform.user.center.api.ModuleApi;
import com.sun.platform.user.center.entity.ModuleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private ModuleApi moduleApi;

    @ResponseBody
    @RequestMapping(value = "module/list")
    public List<ModuleEntity> queryModel(){
        return moduleApi.query(null);
    }
}
