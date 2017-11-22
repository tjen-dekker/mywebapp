package com.realdolmen.mywebapp;

import com.realdolmen.mywebapp.backend.MyRootConfig;
import com.realdolmen.mywebapp.frontend.MyServletConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by TDKBG57 on 2017-11-22.
 */
public class MywebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { MyRootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { MyServletConfig.class }; // specify a configuration class
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // map the DispatcherServlet to '/'
    }
}
