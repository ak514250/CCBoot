package com.sinosoft.ccboot.report.config;

import com.sinosoft.ccboot.report.config.xxljob.ExecutorProperties;
import com.sinosoft.ccboot.report.config.xxljob.XxlJobProperties;
import com.xxl.job.core.executor.XxlJobExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 任务调度执行器的配置
 * @ClassName XxlJobExecutorConfig
 * @Description
 * @Author durenhao
 * @Date 2018/10/18 22:31
 **/
@Configuration
//@PropertySource("classpath:config/xxl-job/xxl-job-executor.properties")
@Slf4j
public class XxlJobExecutorConfig {

    @Autowired
    private XxlJobProperties xxlJobProperties;

    @Bean(initMethod = "start", destroyMethod = "destroy")
    public XxlJobExecutor xxlJobExecutor() {
        log.info(">>>>>>>>>>> xxl-job config init.");
        ExecutorProperties executor = xxlJobProperties.getExecutor();
        XxlJobExecutor xxlJobExecutor = new XxlJobExecutor();
        xxlJobExecutor.setAdminAddresses(xxlJobProperties.getAdmin().getAddresses());
        xxlJobExecutor.setAppName(executor.getAppName());
        xxlJobExecutor.setIp(executor.getIp());
        xxlJobExecutor.setPort(executor.getPort());
        xxlJobExecutor.setAccessToken(xxlJobProperties.getAccessToken());
        xxlJobExecutor.setLogPath(executor.getLogPath());
        xxlJobExecutor.setLogRetentionDays(executor.getLogRetentionDays());

        return xxlJobExecutor;
    }


}
