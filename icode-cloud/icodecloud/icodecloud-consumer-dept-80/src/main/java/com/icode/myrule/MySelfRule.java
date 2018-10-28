package com.icode.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title: <br>
 * Description: <br>
 * Author: XiaChong<br>
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        //Ribbon默认是轮询，我自定义为随机
        //return new RandomRule();

        //我自定义为每个机器被访问5次
        return new RandomRule_XC();
    }
}
