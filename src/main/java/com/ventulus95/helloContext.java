package com.ventulus95;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class helloContext implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Intitalized!!!!!");
        sce.getServletContext().setAttribute("name", "LEECHANGSEOP");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destory!!");
    }
}
