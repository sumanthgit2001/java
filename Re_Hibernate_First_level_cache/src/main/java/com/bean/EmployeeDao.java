package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDao{
	public static void main(String[] args) {
		  Employee emp=new Employee();
			emp.setEmpname("arjun");
			emp.setSalary(11111);
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			//session.save(emp);
			
			Employee query1=  session.get(Employee.class, 1);
			System.out.println(query1.getEmpid()+" "+query1.getEmpname());
//			
//			Employee query2= (Employee) session.get(Employee.class, 2); //see, new query is not generating..
//			System.out.println(query2.getEmpid()+" "+query2.getEmpname());
////			
//			Employee query3= (Employee) session.get(Employee.class, 2);
//			System.out.println(query3.getEmpid()+" "+query3.getEmpname());
			
			session.getTransaction().commit();
			session.close();
			
//			
			Session session1 = sessionFactory.openSession();
			session1.beginTransaction();
			
			Employee q= (Employee) session1.get(Employee.class, 1);
			System.out.println(q.getEmpid()+" "+q.getEmpname());
			session1.getTransaction().commit();
			session1.close();
			
	}

}