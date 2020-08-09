package com.workrc.oauth.controller;

import com.workrc.oauth.orm.entity.UserInfo;
import com.workrc.oauth.orm.service.UserInfoService;
import com.workrc.common.result.Page;
import com.workrc.common.result.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghao
 * @date 2020/7/30 15:47
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @PostMapping("/adduser")
    public ResponseEntity<Integer>  addUser(@RequestBody UserInfo userInfo){
      return ResponseEntity.success(userInfoService.addUser(userInfo));
    }
    @PostMapping("/queryall")
    public ResponseEntity<UserInfo> aueryAll(@RequestBody  Page<UserInfo> page){
        return ResponseEntity.success(page);
    }
}
