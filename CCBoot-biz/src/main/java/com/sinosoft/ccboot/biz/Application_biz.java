package com.sinosoft.ccboot.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application_biz
 * @Description
 * @Author durenhao
 * @Date 2019/2/28 11:49
 **/
@SpringBootApplication
@MapperScan(basePackages = {"com.sinosoft.ccboot.biz.mapper"})
public class Application_biz {

    public static void main(String[] args) {
        SpringApplication.run(Application_biz.class);
    }
}
