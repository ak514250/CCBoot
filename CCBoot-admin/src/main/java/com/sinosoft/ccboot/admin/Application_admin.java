package com.sinosoft.ccboot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application_admin
 * @Description
 * @Author durenhao
 * @Date 2019/2/28 11:40
 **/
@SpringBootApplication
@EnableAdminServer
public class Application_admin {

    public static void main(String[] args) {
        SpringApplication.run(Application_admin.class);
    }

}
