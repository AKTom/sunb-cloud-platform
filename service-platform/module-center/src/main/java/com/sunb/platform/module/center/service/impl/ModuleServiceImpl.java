package com.sunb.platform.module.center.service.impl;

import com.sunb.platform.module.center.dao.ModuleDao;
import com.sunb.platform.module.center.entity.ModuleEntity;
import com.sunb.platform.module.center.service.ModuleService;
import com.sunb.platform.module.center.vo.ModuleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("moduleServiceImpl")
public class ModuleServiceImpl implements ModuleService{
    @Autowired
    private ModuleDao moduledao;
    @Override
    public List<ModuleEntity> find(ModuleVo expressCompanyVo) {
        return moduledao.find();
    }
}
