package com.company.contactApp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages = {"com.company"})
@EnableWebMvc
public class SpringWebConfig extends WebMvcConfigurerAdapter {
	
	

}
