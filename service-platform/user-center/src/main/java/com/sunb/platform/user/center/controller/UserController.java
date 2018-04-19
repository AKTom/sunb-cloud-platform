package com.sunb.platform.user.center.controller;

import com.sunb.platform.user.center.api.ModuleApi;
import com.sunb.platform.user.center.entity.ModuleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private ModuleApi moduleApi;

    @ResponseBody
    @RequestMapping(value = "module/list")
    public List<ModuleEntity> queryModel(){
        return moduleApi.query();
    }
}
