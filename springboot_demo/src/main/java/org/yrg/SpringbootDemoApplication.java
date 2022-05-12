package org.yrg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.yrg.service.UserService;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        // 获取容器对象
        //ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);

        // 从容器中获取对象
        UserService userServiceImpl = (UserService) ctx.getBean("userServiceImpl");

        userServiceImpl.sayHello("la");
    }

    // 声明对象，对象能注入到容器中
//    @Bean
//    public Student myStu(){
//        return new Student();
//    }
}
