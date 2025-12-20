package com.master.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
import com.master.model.AnswerTable; 
import com.master.model.QuestionTable;


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
		
//		QuestionTable q1 = new QuestionTable();
//		q1.setId(1);
//		q1.setQuestion("What is Hibernate?");
//		
//		AnswerTable ans1 = new AnswerTable();
//		ans1.setId(1);
//		ans1.setAnswer("Hibernate is ORM Framework");
//		ans1.setQuestionTable(q1);
//		
//		AnswerTable ans2 = new AnswerTable();
//		ans2.setId(2);
//		ans2.setAnswer("Hibernate is implementation of JPA");
//		ans2.setQuestionTable(q1);
//		
//		List<AnswerTable> answer = new ArrayList<AnswerTable>();
//		answer.add(ans1);
//		answer.add(ans2);
//		 
//		q1.setAnswerList(answer);
		
		QuestionTable question = session.get(QuestionTable.class, 1);
		System.out.println(question.getQuestion());
		question.getAnswerList().forEach(a -> System.out.println(a));
		try {
//			transaction = session.beginTransaction();
//			session.persist(q1); 
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
