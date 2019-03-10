package com.sinosoft.ccboot.biz.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @ClassName DruidConfig
 * @Description
 * @Author durenhao
 * @Date 2019/2/28 17:19
 **/
@Slf4j
@Configuration
public class DruidConfig implements InitializingBean{

    @Resource
    private DataSource dataSource;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("..... datasource");
    }


//    @Bean     //声明其为Bean实例
//    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
//    public DataSource dataSource(){
//        DruidDataSource datasource = new DruidDataSource();
//        datasource.setUrl(dataSourceProperties.getUrl());
//        datasource.setUsername(dataSourceProperties.getUsername());
//        datasource.setPassword(dataSourceProperties.getPassword());
//        datasource.setDriverClassName(dataSourceProperties.getDriverClassName());
//
//        //configuration
//        datasource.setInitialSize(dataSourceProperties.getInitialSize());
//        datasource.setMinIdle(dataSourceProperties.getMinIdle());
//        datasource.setMaxActive(dataSourceProperties.getMaxActive());
//        datasource.setMaxWait(dataSourceProperties.getMaxWait());
//        datasource.setPoolPreparedStatements(dataSourceProperties.getPoolPreparedStatements());
//        datasource.setMaxPoolPreparedStatementPerConnectionSize(dataSourceProperties.getMaxPoolPreparedStatementPerConnectionSize());
//        try {
//            datasource.setFilters(dataSourceProperties.getFilters());
//        } catch (SQLException e) {
//            log.error("druid configuration initialization filter: "+ e);
//        }
//        datasource.setConnectionProperties(dataSourceProperties.getConnectionProperties());
//        return datasource;
//    }
//
//
//    @Bean
//    public FilterRegistrationBean getFilterRegistrationBean(){
//        FilterRegistrationBean filter = new FilterRegistrationBean();
//        filter.setFilter(new WebStatFilter());
//        filter.setName("druidWebStatFilter");
//        filter.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
//        filter.addUrlPatterns("/*");
//        return filter;
//    }
//
//    @Bean
//    public ServletRegistrationBean getServletRegistrationBean(){
//        ServletRegistrationBean servlet = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
//        servlet.setName("druidStatViewServlet");
////        servlet.addInitParameter("resetEnable", "false");
//        servlet.addInitParameter("loginUsername", dataSourceProperties.getUiUsername());
//        servlet.addInitParameter("loginPassword", dataSourceProperties.getUipassword());
//        return servlet;
//    }
//



}
