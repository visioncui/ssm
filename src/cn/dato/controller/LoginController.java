package cn.dato.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	 
	 //��ת����¼ҳ�棺
	 @RequestMapping("/login")
     public String login() throws Exception{

		 return "login";
    	 
     }
	 @RequestMapping("/submit")
	 public String submit(String username,String password,HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		 //�ж��û����������ȷ�ԣ������ȷ�򽫵�¼��Ϣ����session�У������д��������Ŀ����Ҫȥ���ݿ���У���û���������
		 if(username != null){
			 session.setAttribute("username", username);
		 }
		 
		 //��ת���б�ҳ
		 return "redirect:/items/list.action";
		 
	 }
}
