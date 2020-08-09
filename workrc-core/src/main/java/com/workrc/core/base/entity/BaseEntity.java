package com.workrc.core.base.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.workrc.core.global.CurrentUserHolder;


import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {


    /**创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;

    /**创建用户*/
    private String createUser=null== CurrentUserHolder.getCurrentUser()?null:(String)CurrentUserHolder.getCurrentUser();

    /**修改时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lastModifyDate;

    /**修改用户*/
    private String lastModifyUser=null==CurrentUserHolder.getCurrentUser()?null:(String)CurrentUserHolder.getCurrentUser();

    /**状态(是否删除)*/
    private String status;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate==null?new Date():createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate==null?new Date():lastModifyDate;
    }

    public String getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(String lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void saveInit(String username){
       this.createUser = username;
       this.lastModifyDate = new Date();
       this.createDate = new Date();
       this.lastModifyUser = username;
    }

    public void updateInit(String username){
        this.lastModifyDate = new Date();
        this.lastModifyUser = username;
    }

}
