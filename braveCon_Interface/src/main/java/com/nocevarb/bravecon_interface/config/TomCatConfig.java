package com.nocevarb.bravecon_interface.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dong
 * @title: Tomcat配置类
 * @projectName braveOA
 * @date 2024/3/2
 * @description: 自定义的连接器定制器:这个属性允许在路径中包含特殊字符"<>[\]^{|}
 */
@Configuration
public class TomCatConfig {
    @Bean
    public TomcatServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers((Connector connector) -> {
            connector.setProperty("relaxedPathChars", "\"<>[\\]^`{|}");
            connector.setProperty("relaxedQueryChars", "\"<>[\\]^`{|}");
        });
        return factory;
    }
}
