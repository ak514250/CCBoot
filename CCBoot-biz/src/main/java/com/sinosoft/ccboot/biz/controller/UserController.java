package com.sinosoft.ccboot.biz.controller;

import com.sinosoft.ccboot.biz.mapper.UserMapper;
import com.sinosoft.ccboot.common.model.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @ClassName UserController
 * @Description
 * @Author durenhao
 * @Date 2019/3/10 11:12
 **/
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    private Long id = 1L;

    private Long orderId = 0L;

    @PostMapping("/user/add")
    public String addUser(){
        log.info("增加用户！");
        User user0 = new User();
        user0.setName("张三");
        user0.setAge(11);
        user0.setUserId(id++);
        user0.setOrderId(orderId++);
        userMapper.insert(user0);

        User user = new User();
        user0.setName("李四");
        user0.setAge(12);
        user0.setUserId(getId());
        user0.setOrderId(getId());
        userMapper.insert(user0);
        return "success";
    }

    private Long getId(){
        int v = (int)(Math.random() * 9 + 1) * 100000;
        return new Long(v);
    }

}
