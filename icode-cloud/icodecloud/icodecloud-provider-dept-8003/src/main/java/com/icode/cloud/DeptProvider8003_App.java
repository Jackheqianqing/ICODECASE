package com.icode.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Title: <br>
 * Description: <br>
 * Author: XiaChong<br>
 */

/**
 * 本服务启动后会自动注册进eureka服务中
 */
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
@SpringBootApplication
public class DeptProvider8003_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class, args);
    }
}
