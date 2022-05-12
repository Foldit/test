package org.yrg.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.yrg.web.MyServlet;

@Configuration
public class WebApplicationConfig {

    // 定义方法，注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){

        // ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(), "/myservlet");

        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login", "/test");

        return bean;
    }

//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//        bean.setFilter(new MyFilter());
//        bean.addUrlPatterns("/*");
//        return bean;
//    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        // 使用框架中的过滤器类
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        // 指定使用的编码类型
        filter.setEncoding("utf-8");
        // 指定request response都使用encoding的值
        filter.setForceEncoding(true);
        bean.setFilter(filter);
        bean.addUrlPatterns("/*");
        return bean;
    }

}
