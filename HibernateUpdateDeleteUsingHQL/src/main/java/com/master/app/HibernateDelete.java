package com.master.app;


import java.util.concurrent.CountDownLatch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.master.model.Student;




public class HibernateDelete {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Integer count=null;
		
		try {
			session =sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			 count = session.createMutationQuery("DELETE from Student WHERE sid=:id")
			.setParameter("id", 2).executeUpdate();
			
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			if (flag == true) {
				transaction.commit();
				System.out.println("Transaction Success"
						+ " Total rows " + count +" affected");
			}else {
				transaction.rollback();
				System.out.println("Transaction Failed"
						+ "Total rows " + count +" affected");
			}
			session.close();
			sessionFactory.close();
		}


	}

}
