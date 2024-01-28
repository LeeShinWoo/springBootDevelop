package springBootDevelop.application;

import org.apache.catalina.LifecycleException;

import springBootDevelop.server.Server;
import springBootDevelop.server.TomcatServer;
import springBootDevelop.servlet.DispatcherServlet;

/**
 * 실행 되는 Main Application
 * @author A
 *
 */
public class Application {
	Server server;
	public static void main(String[] args) throws LifecycleException {
		Application app = new Application();
		app.run();
		
	}
	
	public void run() throws LifecycleException{
		server = new TomcatServer();
		
		server.setPort(8080);
		server.addContext("/", "/");
		server.addServlet("/", "MainServlet", new DispatcherServlet());
		server.addServletMappingDecoded("", "MainServlet");
		server.start();
	}
}
