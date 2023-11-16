package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.module.Configuration;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDao {
	EmployeeClass ec=new EmployeeClass();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		float sal = Float.parseFloat(request.getParameter("sal"));
		
		
		ec.setName(name);
		ec.setSal(sal);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		// Require to start session
		Session session = sessionFactory.openSession();
		//Transaction start
		session.beginTransaction();
		//insert a record-->
		int i = (Integer) session.save(emp);
		//save changes in database permanently
		session.getTransaction().commit();
		//check for save
		PrintWriter out = response.getWriter();
		if (i > 0)
			out.println("Record inserted");
		else
			out.println("Record not inserted");

		
		
	}
}
