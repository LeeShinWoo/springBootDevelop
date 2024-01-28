package springBootDevelop.server;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

import jakarta.servlet.Servlet;
import springBootDevelop.servlet.DispatcherServlet;

public class TomcatServer implements Server{
	Tomcat tomcat;
	Context context;
	public TomcatServer() {
		tomcat = new Tomcat();
	}
	
	@Override
	public void setPort(int port) {
		// TODO Auto-generated method stub
		Connector connector = new Connector();
        connector.setPort(port);
        tomcat.setConnector(connector);
	}

	@Override
	public void addServlet(String contextPath, String servletName, Servlet servlet) {
		// TODO Auto-generated method stub
		tomcat.addServlet(contextPath,servletName,servlet);
        
	}

	@Override
	public void addContext(String contextPath, String docBase) {
		// TODO Auto-generated method stub
		context = tomcat.addContext(contextPath,docBase);
		
	}

	@Override
	public void addServletMappingDecoded(String pattern, String name) {
		// TODO Auto-generated method stub
		context.addServletMappingDecoded(pattern, name);
	}

	@Override
	public void start() throws LifecycleException {
		// TODO Auto-generated method stub
		tomcat.start();
	}

}
