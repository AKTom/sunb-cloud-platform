package com.sunb.platform.module.center.service;

import com.sunb.platform.module.center.entity.ModuleEntity;
import com.sunb.platform.module.center.vo.ModuleVo;

import java.util.List;

public interface ModuleService {
    List<ModuleEntity> find(ModuleVo expressCompanyVo);
}
