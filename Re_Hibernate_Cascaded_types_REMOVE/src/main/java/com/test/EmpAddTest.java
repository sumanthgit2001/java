package com.test;
import com.model.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class EmpAddTest {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setName("kk rao");
	e.setDept("py");
	Address a=new Address();
	a.setCity("kkk");
	a.setState("tel");
	
	e.setAdd(a);
	a.setEmp(e);
	
	SessionFactory ss=new Configuration().configure().buildSessionFactory();
	Session s=ss.openSession();
	s.beginTransaction();
	
	int i = (Integer)s.save(e);
	if (i > 0) {
		System.out.println("Data saved");
	}
	
	
//	Employee emp=(Employee) s.get(Employee.class, 3);
//	s.delete(emp);   //deleting.......................... 
	
//	Address ad=(Address) s.get(Address.class, 3);
//	s.delete(ad);  //could delete errorrrr 
	//s.getTransaction().commit();
	s.close();
}
}
