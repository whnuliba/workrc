package com.workrc.oauth.orm.service;

import com.workrc.oauth.orm.entity.UserInfo;
import com.workrc.common.result.Page;

import java.util.List;

/**
 * @author wanghao
 * @date 2020/7/30 15:21
 * @desc
 */
public interface UserInfoService {
    int addUser(UserInfo u);
    List<UserInfo> queryAll(Page<UserInfo> userInfoPage);
}
