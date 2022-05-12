package org.yrg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.yrg.web.LoginInterceptor;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    // 添加拦截器对象,注入到容器中

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 创建拦截器对象
        HandlerInterceptor interceptor = new LoginInterceptor();

        // 指定拦截器的请求uri地址
        String[] path = {"/query"};
        String[] excludePath = {"/stu"};
        registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);
    }
}
