package com.sun.platform.module.center.service;

import com.sun.platform.module.center.entity.ModuleEntity;
import com.sun.platform.module.center.vo.ModuleVo;

import java.util.List;

public interface ModuleService {
    List<ModuleEntity> find(ModuleVo expressCompanyVo);
}
