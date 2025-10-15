package com.sai.springmvc.configuration;

import javax.servlet.ServletContext;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebConfig implements WebApplicationInitializer  {
	
	

public void onStartup(ServletContext servletContext){

AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

context.register(JavaSpringMVCConfiguration.class);

DispatcherServlet dispatcher = new DispatcherServlet(context);

javax.servlet.ServletRegistration.Dynamic servlet =  servletContext.addServlet("dispatcher",dispatcher);

servlet.setLoadOnStartup(1);
servlet.addMapping("/");
}
}