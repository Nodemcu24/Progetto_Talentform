package com.example.demo;
import com.example.demo.FirstServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
	@Bean
    public ServletRegistrationBean<FirstServlet> secondServletRegistration() {
        ServletRegistrationBean<FirstServlet> servlet = new ServletRegistrationBean<>(new FirstServlet(), 
        		"/FirstServlet");
        servlet.setLoadOnStartup(1);
        return servlet;
    }

}
