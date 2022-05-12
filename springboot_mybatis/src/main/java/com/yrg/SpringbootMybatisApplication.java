package com.yrg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @MapperScan 找到Dao接口和Mapper文件
 * @EnableTransactionManagement 启用事务管理器
 */

@SpringBootApplication
@MapperScan(basePackages = "com.yrg.dao")
@EnableTransactionManagement
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
