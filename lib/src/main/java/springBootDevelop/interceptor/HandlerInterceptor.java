package springBootDevelop.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface HandlerInterceptor {
	
	/**
	 * Controller 호출 후 후처리
	 * @param request
	 * @param response
	 * @param handler
	 * @throws Exception
	 */
	public void postHandle(HttpServletRequest request,
			 HttpServletResponse response,
			 Object handler) throws Exception;
	/**
	 * Controller 호출 전 전처리
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	public boolean preHandler(HttpServletRequest request,
			 HttpServletResponse response,
			 Object handler) throws Exception;
	
	/**
	 * View 리졸버 적용이 끝난뒤 호출
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	public boolean afterCompletion(HttpServletRequest request,
			 HttpServletResponse response,
			 Object handler) throws Exception;
}
