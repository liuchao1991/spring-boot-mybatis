package com.liuchao1991.controller;

import com.liuchao1991.model.UserModel;
import com.liuchao1991.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author liuchao
 * @date 2018/6/24 15:54
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public void save() {
        UserModel user = new UserModel();

        user.setName("张三");
        user.setAge(23);
        user.setSex(1);
        user.setEmail("zhangsan@qq.com");
        user.setPhone("15888888888");
        userService.insertSelective(user);
    }
}
