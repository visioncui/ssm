package cn.dato.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor1 implements HandlerInterceptor{
	//ִ��ʱ����cotroller�Ѿ�ִ�У�modelAndview�Ѿ�����
	//ʹ�ó�������¼������־����¼��¼�û���ip��ʱ���
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
    
	//ִ��ʱ����Controller�����Ѿ�ִ�У�ModelAndViewû�з���
	//ʹ�ó����������ڴ˷���������ȫ�ֵ����ݴ���ҵ��
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
    
	//���ز���ֵ���������true���У�����false������ס
	//ִ��ʱ����controller����û�б�ִ�У�ModelAndViewû�б�����
	//ʹ�ó�����Ȩ����֤
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}
      
}
