package com.lsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.lsx.item.mapper")
public class LyitemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyitemApplication.class,args);
    }
}
