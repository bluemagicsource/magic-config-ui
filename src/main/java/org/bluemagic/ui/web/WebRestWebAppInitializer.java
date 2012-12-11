package org.bluemagic.ui.web;

import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
 
public class WebRestWebAppInitializer implements WebApplicationInitializer {
	
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
    	
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
        root.scan("org.bluemagic.ui.config");
 
        // Manages the lifecycle of the root application context
        servletContext.addListener(new ContextLoaderListener(root));
 
        ServletRegistration.Dynamic bluemagic = servletContext.addServlet("bluemagic", new DispatcherServlet(root));
        bluemagic.setLoadOnStartup(1);
        
        Set<String> mappingConflicts = bluemagic.addMapping("/");
        
        if (!mappingConflicts.isEmpty()) {
            throw new IllegalStateException("'appServlet' could not be mapped to '/' due " +
                    "to an existing mapping. This is a known issue under Tomcat versions " +
                    "<= 7.0.14; see <a href=\"https://issues.apache.org/bugzilla/show_bug.cgi?id=51278\">https://issues.apache.org/bugzilla/show_bug.cgi?id=51278</a>");
        }
    }
}