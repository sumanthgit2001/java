package com.util;
import com.model.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("sumanth");
		e.setDepartment("java");
		
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session ses=s.openSession();
		ses.beginTransaction();
		ses.save(e);
		ses.getTransaction().commit();
		ses.close();
	}

}
