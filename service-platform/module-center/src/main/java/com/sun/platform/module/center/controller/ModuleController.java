package com.sun.platform.module.center.controller;

import com.sun.platform.module.center.entity.ModuleEntity;
import com.sun.platform.module.center.vo.ModuleVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("module")
public class ModuleController {

    @RequestMapping(value = "list", method = RequestMethod.POST)
    public List<ModuleEntity> queryExpressCompanyList(@RequestBody(required = false) ModuleVo expressCompanyVo) {

        List list = new ArrayList();
        ModuleEntity entity =  new ModuleEntity();
        entity.setId(1l);
        entity.setName("测试");
        list.add(entity);
        return list;
    }

}
