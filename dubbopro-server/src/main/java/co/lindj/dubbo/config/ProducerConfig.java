package co.lindj.dubbo.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author lindj
 * @date 2019/9/16 0016
 * @description
 */
@Data
@ToString
@ConfigurationProperties(prefix = "rocketmq.producer")
@Configuration
public class ProducerConfig {
    private String namesrvAddr;
    private String groupName;
}
