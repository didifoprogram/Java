package com.dfmzone.springdemo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebMvcInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(WebMvcConfig.class);
		
		ServletRegistration.Dynamic registration = arg0.addServlet("dispatcher", new DispatcherServlet(rootContext));
		registration.addMapping("/");
		registration.setLoadOnStartup(1);
	}
}
