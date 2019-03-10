package com.sinosoft.ccboot.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application_task
 * @Description
 * @Author durenhao
 * @Date 2019/2/28 19:15
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.sinosoft.ccboot.task.dao")
public class Application_task {

    public static void main(String[] args) {
        SpringApplication.run(Application_task.class);
    }

}
