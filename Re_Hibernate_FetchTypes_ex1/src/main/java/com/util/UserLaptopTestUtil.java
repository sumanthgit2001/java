//package com.util;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.bean.Laptops;
//import com.bean.Users;
//public class UserLaptopTestUtil {
//
//	public static void main(String[] args) {
//		Users u=new Users();
//		u.setName("Sumanth");
//		u.setEduaction("btech");
//	
//		
//		
//		List<Laptops> laplist=new ArrayList<>();
//		Laptops lap=new Laptops();
//		lap.setBrand("dell");
//		lap.setModel("desadf");
//		Laptops lap1=new Laptops();
//		lap1.setBrand("hp");
//		lap1.setModel("hpp");
//		Laptops lap2=new Laptops();
//		lap2.setBrand("lenovo");
//		lap2.setModel("lennn");
//		laplist.add(lap);
//		laplist.add(lap1);
//		laplist.add(lap2);
//	
//		u.setLaptops(laplist);
//		lap.setUser(u);
//		lap1.setUser(u);
//		lap2.setUser(u);
//		
//		
//		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
//		Session session=sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(u);
//		session.close();
//		
//	}
//
//}
