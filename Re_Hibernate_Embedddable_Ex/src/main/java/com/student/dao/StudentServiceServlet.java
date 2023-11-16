package com.student.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.student.entity.StudentDetails;
import com.student.entity.TypeOfNames;

public class StudentServiceServlet {
	public static void main(String[] args) {
		
	
	TypeOfNames typename=new TypeOfNames();
	typename.setFname("Sumanth");
	typename.setMname("Chanti");
	typename.setLname("pothuganti");
	
	
	StudentDetails s=new StudentDetails();
	s.setMarks(92);
	s.setRoll(1);
	s.setSname(typename);
	
	
	
	
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	session.beginTransaction();
	session.save(s);
	session.getTransaction().commit();
	session.close();
	
	
	}
}
