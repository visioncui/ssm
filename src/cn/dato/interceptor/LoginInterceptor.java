package cn.dato.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// �жϵ�ǰ����·���Ƿ�Ϊ��¼��·��������������
		if(request.getRequestURL().indexOf("/login")>0){
			
			return true;
		}
		
		// �ж�session���Ƿ��е�¼��Ϣ�����û������ת����¼ҳ�棬����������
		
		HttpSession session = request.getSession();
		if(session.getAttribute("username")!=null){
			return true;
		}
		
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);//��ת����¼ҳ��
		return false;
	}

}
