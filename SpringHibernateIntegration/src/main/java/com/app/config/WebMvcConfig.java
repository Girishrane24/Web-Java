package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.app")
public class WebMvcConfig implements WebMvcConfigurer  {
	
	@Bean
	public InternalResourceViewResolver interResourceViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		// resolver.setViewClass(
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	
}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/resources/**")
		.addResourceLocations("/resources/**");
		
//		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
}
