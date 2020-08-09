package com.workrc.oauth.orm.service.impl;

import com.workrc.oauth.orm.entity.UserInfo;
import com.workrc.oauth.orm.mapper.UserInfoMapper;
import com.workrc.oauth.orm.service.UserInfoService;
import com.workrc.common.result.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.UUID;

/**
 * @author wanghao
 * @date 2020/7/30 15:42
 * @desc
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public int addUser(UserInfo u) {
        Assert.notNull(u,"userInfoPage 传入参数为空");
        u.setId(UUID.randomUUID().toString());
        return userInfoMapper.insert(u);
    }

    @Override
    public List<UserInfo> queryAll(Page<UserInfo> userInfoPage) {

        return userInfoMapper.queryAll(userInfoPage);
    }
}
