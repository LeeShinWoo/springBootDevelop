package springBootDevelop.application;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import springBootDevelop.servlet.MainServlet;

/**
 * 실행 되는 Main Application
 * @author A
 *
 */
public class Application {
	public static void main(String[] args) throws LifecycleException {
		/*
		String webappDirLocation = "src/main/webapp";
		Tomcat tomcat = new Tomcat();

		String webPort = System.getenv("PORT");

		if (webPort == null || webPort.isEmpty()) {
			webPort = "8000";
		}
		tomcat.setPort(Integer.parseInt(webPort));

		StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
		System.out.println(new File("./" + webappDirLocation).getAbsolutePath());

		File additionWebInfClass = new File("bin/main/springBootDevelop");

		WebResourceRoot resources = new StandardRoot(ctx);
		resources.addPreResources(
				new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClass.getAbsolutePath(), "/"));

		ctx.setResources(resources);

		tomcat.start();
		tomcat.getServer().await();
		*/
		
        // Tomcat 설정
        Tomcat tomcat = new Tomcat();
        Connector connector = new Connector();
        connector.setPort(8080);
        tomcat.setConnector(connector);

        // Servlet 등록
        Context context = tomcat.addContext("/", "/");
        tomcat.addServlet("/", "MainServlet", new MainServlet());
        context.addServletMappingDecoded("/MainServlet", "MainServlet");
        tomcat.start();
	}
}
