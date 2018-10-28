package com.icode.cloud;

import com.icode.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Title: <br>
 * Description: <br>
 * Author: XiaChong<br>
 */
@RibbonClient(name="ICODECLOUD-DEPT",configuration= MySelfRule.class)
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer8000_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8000_App.class, args);
    }
}
