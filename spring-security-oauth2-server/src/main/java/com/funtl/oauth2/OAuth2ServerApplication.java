package com.funtl.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-12-24 21:54
 */
@SpringBootApplication
@MapperScan(basePackages = "com.funtl.oauth2.server.mapper")

public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }

}