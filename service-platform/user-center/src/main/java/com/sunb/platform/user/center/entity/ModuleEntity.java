package com.sunb.platform.user.center.entity;

import java.io.Serializable;
import lombok.Data;
import java.util.Date;

/**
* Author:      sunbin
* Mail:        sunbin@sudiyi.cn
* Date:        10:32 2018/04/19
* Version:     1.0
* Description: Module实体
*/
@Data
public class ModuleEntity implements Serializable {

    public ModuleEntity() {
    }


    /**
     * 主键
     */
    private Long id;

    /**
     * 系统模块名称
     */
    private String moduleName;

    /**
     * 模块编码
     */
    private String moduleCode;

    /**
     * 描述
     */
    private String remark;

    /**
     * 状态 0、不可用  1、可用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


}
