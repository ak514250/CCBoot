package com.sinosoft.ccboot.report.config;

import com.sinosoft.ccboot.report.config.xxljob.XxlJobProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName BeanConfig
 * @Description
 * @Author durenhao
 * @Date 2019/1/20 20:37
 **/
@Configuration
@EnableConfigurationProperties(XxlJobProperties.class)
public class BeanConfig {
}
