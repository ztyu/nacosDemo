package com.example.nacosdemo;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosConfigurationProperties(dataId = "luckyboy",autoRefreshed = true, ignoreNestedProperties = true,type = ConfigType.YAML)
public class NacosdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosdemoApplication.class, args);
    }

}
