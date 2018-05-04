package com.ysu2013;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author AaronJiang
 * @version 1.0
 * @date 2018/04/26
 * @mail 1327994105@qq.com
 * @description WebStarter
 */

@SpringBootApplication(scanBasePackages = {"com.ysu2013.config","com.ysu2013.web","com.ysu2013.service"})
@EntityScan(basePackages = {"com.ysu2013.entity"})
@EnableJpaRepositories(basePackages = {"com.ysu2013.repo"})
public class WebStarter {

    public static void main(String[] args){
        //启动Spring Boot程序
        SpringApplication.run(WebStarter.class,args);
    }
}
