package com.sun.platform.module.center.controller;

import com.sun.platform.module.center.entity.ModuleEntity;
import com.sun.platform.module.center.service.ModuleService;
import com.sun.platform.module.center.vo.ModuleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("module")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;
    @RequestMapping(value = "list", method = RequestMethod.POST)
    public List<ModuleEntity> queryExpressCompanyList(@RequestBody(required = false) ModuleVo expressCompanyVo) {
        return moduleService.find(expressCompanyVo);
    }

}
