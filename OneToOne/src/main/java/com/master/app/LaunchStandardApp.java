package com.master.app;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.master.model.Answer;
import com.master.model.Question;


public class LaunchStandardApp {

	public static void main(String[] args) {
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		config = new Configuration();
		config.configure();
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		
//		Question q1 = new Question();
//		q1.setId(1);
//		q1.setQuestion("What is Hibernate?");
//		
//		Answer ans1 = new Answer();
//		ans1.setId(1);
//		ans1.setAnswer("Hibernate is ORM Framework");
//		
//		q1.setAnswer(ans1);
//		
//		Question q2 = new Question();
//		q2.setId(2);
//		q2.setQuestion("What is JPA?");
//		
//		Answer ans2 = new Answer();
//		ans2.setId(2);
//		ans2.setAnswer("It is specification used to persist data between java object and relatinal databases");
//		q2.setAnswer(ans2);
		
		Question q1 = session.get(Question.class, 1);
		System.out.println(q1);
		
		Question q2 = session.get(Question.class, 2);
		System.out.println(q2);
		try {
//			transaction = session.beginTransaction();
//			session.persist(q1);
//			session.persist(q2);
//			flag = true;

			
		} catch (HibernateError e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (flag == true) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
		}

	}

}
