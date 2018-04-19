package com.sunb.platform.user.center.entity;

import java.io.Serializable;
import lombok.Data;
import java.util.Date;

/**
* Author:      sunbin
* Mail:        sunbin@sudiyi.cn
* Date:        10:32 2018/04/19
* Version:     1.0
* Description: User实体
*/
@Data
public class UserEntity implements Serializable {

    public UserEntity() {
    }


    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 类型
     */
    private String type;

    /**
     * app_id
     */
    private String appId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;


}
