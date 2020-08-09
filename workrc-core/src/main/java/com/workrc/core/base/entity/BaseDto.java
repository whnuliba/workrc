package com.workrc.core.base.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.workrc.core.global.CurrentUserHolder;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BaseDto implements Serializable {
    /**创建用户*/
    private String createUser= null== CurrentUserHolder.getCurrentUser()?null:(String)CurrentUserHolder.getCurrentUser();
    /**修改用户*/
    private String lastModifyUser=null==CurrentUserHolder.getCurrentUser()?null:(String)CurrentUserHolder.getCurrentUser();
    /*开始时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//页面写入数据库时格式化
    private Date beginTime;
    /*结束时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//页面写入数据库时格式化
    private Date endTime;

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(String lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
