package com.appConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {

		
		AnnotationConfigWebApplicationContext apc = new AnnotationConfigWebApplicationContext();
		
		
		apc.register(ApplicationConfiguration.class);
		
		apc.setServletContext(context);
		
		ServletRegistration.Dynamic dynamic=context.addServlet("dispatcher", new DispatcherServlet(apc));
		
		dynamic.addMapping("/");
		
	}
	
	
	
	
	
	
	

}
