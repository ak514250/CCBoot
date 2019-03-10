package com.sinosoft.ccboot.report.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hello
 * @Description
 * @Author durenhao
 * @Date 2019/2/28 20:29
 **/
@RestController
public class Hello {

    public String hello(){
        return "hello..report";
    }

}
