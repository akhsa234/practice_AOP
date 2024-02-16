package com.bahar.practice_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PracticeAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeAopApplication.class, args);

    }

}
