package com.sun.platform.module.center.dao;

import com.sun.platform.module.center.entity.ModuleEntity;

import java.util.List;

public interface ModuleDao {
    List<ModuleEntity> find();
}
