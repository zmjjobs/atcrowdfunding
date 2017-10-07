package com.gxkj.atcrowdfunding.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ServerStartUpListener
 *
 */
public class ServerStartUpListener implements ServletContextListener{
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("将请求的上下文路径放在application中");
		ServletContext application = event.getServletContext();
		application.setAttribute("APP_PATH", application.getContextPath());
	}
}
