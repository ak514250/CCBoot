package com.sinosoft.ccboot.report;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application_report
 * @Description
 * @Author durenhao
 * @Date 2019/2/28 20:19
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.sinosoft.ccboot.report.mapper")
public class Application_report {

    public static void main(String[] args) {
        SpringApplication.run(Application_report.class);
    }
}
