/**
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package org.dream.chaser.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * 应用启动类
 *
 * @author admin
 * @version $Id: Application.java, v 0.1 2018-08-23 18:00 admin Exp $$
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class},
        scanBasePackages = {"org.dream.chaser"})
@EnableAsync
@EnableScheduling
@EnableWebMvc
@ServletComponentScan
@MapperScan(value = "org.dream.chaser.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }

}

