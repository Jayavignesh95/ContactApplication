package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class LoginValidation extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginId=req.getParameter("rname");
		String pass=req.getParameter("rpwd");
		PrintWriter out = resp.getWriter();
		Objectify ofy = ObjectifyService.ofy();
		ObjectifyService.register(LoginDetails.class);
		boolean loginValid=false;
		System.out.println(loginId+"   "+pass);
		List<LoginDetails> ul = ofy.load().type(LoginDetails.class).list();
		for (LoginDetails ucheck : ul) {
			System.out.println(ucheck.getuserId());
			System.out.println(ucheck.getPass());
			if (ucheck.getuserId().equals(loginId)&&ucheck.getPass().equals(pass)) {
				System.out.println(ucheck.getuserId());
				System.out.println(ucheck.getPass());
				loginValid=true;
			}
			
		}
		if(loginValid==true)
		{
			//out.println("Success");
			
			HttpSession session = req.getSession(true);
			session.setAttribute("name", loginId);
			session.setMaxInactiveInterval(5 * 60);
			RequestDispatcher rd=req.getRequestDispatcher("/welcome.jsp");
			 rd.forward(req,resp);
		}
		else
		{
			//out.println("Failed");
			RequestDispatcher rd=req.getRequestDispatcher("/Failed.html");
			 rd.forward(req,resp);
		}
		
	}
}
