package com.training.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

/**
 * @author : tianwei
 * @date : 2024-07-07 20:08
 * @description:
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MongodbApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MongodbApp.class, args);
    }


}
