package com.icode.colud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Title: <br>
 * Description: <br>
 * Author: XiaChong<br>
 */
/**
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
