package com.exampleA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import com.exampleA.config.JwtFilter;

@SpringBootApplication
public class StudentManagementSystemApplication {

    @SuppressWarnings("rawtypes")
    
    FilterRegistrationBean jwtFilter()
	{
		final FilterRegistrationBean<JwtFilter> registrationBean=new FilterRegistrationBean<JwtFilter>();
			registrationBean.setFilter(new JwtFilter());
		    registrationBean.addUrlPatterns("/api/*");
			return registrationBean;
	
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

}