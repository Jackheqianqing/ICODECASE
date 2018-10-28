package com.icode.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Title: <br>
 * Description: <br>
 * Author: XiaChong<br>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.icode.cloud"})
@ComponentScan("com.icode.cloud")
public class DeptConsumer8000_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8000_Feign_App.class, args);
    }
}
