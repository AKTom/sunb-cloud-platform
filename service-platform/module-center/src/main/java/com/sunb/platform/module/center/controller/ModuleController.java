package com.sunb.platform.module.center.controller;

import com.sunb.platform.module.center.entity.ModuleEntity;
import com.sunb.platform.module.center.service.ModuleService;
import com.sunb.platform.module.center.vo.ModuleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("module")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;
    @RequestMapping(value = "list", method = RequestMethod.POST)
    public List<ModuleEntity> queryExpressCompanyList() {
        return moduleService.find(null);
    }

}
