package com.master.app;

import java.util.Arrays;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.master.model.Student;



public class putData {

	public static void main(String[] args) {
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Student.class);
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		
		Student s1 = new Student();
		s1.setSid(1);
		s1.setsName("Atharv");
		s1.setsCity("Mumbai");

		Student s2 = new Student();
		s2.setSid(2);
		s2.setsName("Rahul");
		s2.setsCity("Pune");

		Student s3 = new Student();
		s3.setSid(3);
		s3.setsName("Sneha");
		s3.setsCity("Nashik");

		Student s4 = new Student();
		s4.setSid(4);
		s4.setsName("Vikram");
		s4.setsCity("Nagpur");

		Student s5 = new Student();
		s5.setSid(5);
		s5.setsName("Priya");
		s5.setsCity("Kolhapur");

		Student s6 = new Student();
		s6.setSid(6);
		s6.setsName("Rohit");
		s6.setsCity("Thane");

		
	
		try {
			transaction = session.beginTransaction();
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
			session.persist(s4);
			session.persist(s5);
			session.persist(s6);
			flag = true;

			
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
