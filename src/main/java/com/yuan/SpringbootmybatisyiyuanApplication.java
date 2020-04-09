package com.yuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ServletComponentScan
@EnableScheduling
public class SpringbootmybatisyiyuanApplication {
/*启动类*/
    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisyiyuanApplication.class, args);
    }

}
