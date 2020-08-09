package com.workrc.oauth.orm.mapper;

import com.workrc.oauth.orm.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * UserInfoDAO继承基类
 */
@Repository
public interface UserInfoMapper extends MyBatisBaseDao<UserInfo, String> {
}