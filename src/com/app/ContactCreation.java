package com.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Contact;
public class ContactCreation extends  HttpServlet{

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Contact contact=new Contact();
       contact.setFirstName(req.getParameter("fname"));
       contact.setLastName(req.getParameter("lname"));
       System.out.println(req.getParameter("fname"));
       System.out.println(req.getParameter("lname"));
       System.out.println(req.getParameter("uname"));
       System.out.println(req.getParameter("mobile[]"));
//       System.out.println(req.getParameter("mobile[1]"));
}
}
