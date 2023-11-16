package service;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Answer;
import beans.Question;




public class HibernateTestServlet{
	
	
	
	public static void register(Question question1){
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Question ques=session.get(Question.class, 1);
		System.out.println(ques.getQid()+" " +ques.getQues());
		
		
		
//		Collection<Answer> col=ques.getAnswers();
//		
//		for(Answer a:col)
//			System.out.println(a.getAid()+" " +a.getAnswers()+ " " +a.getPostedBy());
//		if we ask then only its generating a query for answers in defualt lazy mode.
		
		
		
		
		
		
		
		session.getTransaction().commit();
		session.close();
	}

	public static void main(String[] args) {
		
	
	ArrayList<Answer> ansList= new ArrayList<Answer>();
		
		Question question1=new Question();
		 question1.setQues("What is Hibernate?");
		 question1.setAnswers(ansList);
		
		 
		 
		 Answer ans1=new Answer();
		 ans1.setAnswers("Hibernate is a framework");
		 ans1.setPostedBy("Anita");
		 ansList.add(ans1);
		 
		 Answer ans2=new Answer();
		 ans2.setAnswers("Hibernate is based on ORM");
		 ans2.setPostedBy("Sunil");
		 ansList.add(ans2); 
	    
		register(question1);
	}

}