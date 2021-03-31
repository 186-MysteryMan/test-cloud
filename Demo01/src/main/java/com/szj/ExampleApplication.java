package com.szj;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shenggongjie
 * @date 2021/3/30 22:59
 */
@SpringCloudApplication
@ComponentScan(basePackages = {"com.szj"})
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class,args);
    }
}
