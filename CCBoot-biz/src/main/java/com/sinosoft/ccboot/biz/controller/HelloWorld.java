package com.sinosoft.ccboot.biz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorld
 * @Description
 * @Author durenhao
 * @Date 2019/2/28 12:07
 **/
@RestController
@Api("hello")
@Slf4j
public class HelloWorld {


    @GetMapping("/hello")
    @ApiOperation("/测试")
    public String hello(){
        return "hello....";
    }

    @PostMapping("/hello2")
    public void hello2(){
        log.info("收到请求");
    }
}
