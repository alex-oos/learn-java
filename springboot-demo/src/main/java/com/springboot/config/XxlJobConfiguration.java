package com.springboot.config;


import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alex
 * @date 2021/9/18 5:18 下午
 * <P></p>
 */
@Slf4j
@Data
@Configuration
@ConditionalOnProperty(
        prefix = "xxl.job.admin",
        name = {"addresses"}
)
@ConfigurationProperties(prefix = "xxl.job.admin")
public class XxlJobConfiguration {

    private String addresses;

    private String appName;

    private String ip;

    private int port;

    private String accessToken;

    private String logPath;

    private int logRetentionDays;

    @Bean(
            initMethod = "start",
            destroyMethod = "destroy"
    )
    public XxlJobSpringExecutor xxlJobSpringExecutor() {

        log.info(">>>>>>>>>>> xxl-job config init...");
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(this.addresses);
        xxlJobSpringExecutor.setAppName(this.appName);
        xxlJobSpringExecutor.setIp(this.ip);
        xxlJobSpringExecutor.setPort(this.port);
        xxlJobSpringExecutor.setAccessToken(this.accessToken);
        xxlJobSpringExecutor.setLogPath(this.logPath);
        xxlJobSpringExecutor.setLogRetentionDays(this.logRetentionDays);
        return xxlJobSpringExecutor;
    }

}
