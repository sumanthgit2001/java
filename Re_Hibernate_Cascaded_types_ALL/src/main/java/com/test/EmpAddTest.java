package com.test;
import com.model.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class EmpAddTest {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setName("arjun");
	e.setDept("java");
	Address a=new Address();
	a.setCity("tg");
	a.setState("tg");
	
	e.setAdd(a);
	a.setEmp(e);
	
	SessionFactory ss=new Configuration().configure().buildSessionFactory();
	Session s=ss.openSession();
	s.beginTransaction();
	//s.save(e);
//	Employee emp = (Employee) s.get(Employee.class, 2);
//	s.delete(emp);  // all remove type also works...
	s.getTransaction().commit();
	s.close();
}
}
