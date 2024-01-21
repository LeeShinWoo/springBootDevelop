package springBootDevelop.server;

import org.apache.catalina.LifecycleException;

import jakarta.servlet.Servlet;

public interface Server {
	/**
	 * Server 기동 Port 지정
	 * @param port
	 */
	public void setPort(int port);
	
	/**
	 * Servlet 추가
	 * @param contextPath
	 * @param servletName
	 * @param servlet
	 */
	public void addServlet(String contextPath,
            String servletName,
            Servlet servlet);
	
	/**
	 * Context Path 추가
	 * @param contextPath
	 * @param docBase
	 */
	public void addContext(String contextPath, String docBase);
	
	/**
	 * Servlet 매핑 정보 추가
	 * @param pattern
	 * @param name
	 */
	public void addServletMappingDecoded(String pattern, String name);

	/**
	 * Server 구동
	 */
	public void start() throws LifecycleException;
}
