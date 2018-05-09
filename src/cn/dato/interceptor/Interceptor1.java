package cn.dato.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor1 implements HandlerInterceptor{
	//执行时机：cotroller已经执行，modelAndview已经返回
	//使用场景：记录操作日志，记录登录用户的ip、时间等
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
    
	//执行时机：Controller方法已经执行，ModelAndView没有返回
	//使用场景：可以在此方法中设置全局的数据处理业务
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
    
	//返回布尔值：如果返回true放行，返回false则被拦截住
	//执行时机：controller方法没有被执行，ModelAndView没有被返回
	//使用场景：权限认证
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}
      
}
