package com.master.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.master.model.Student;




public class LaunchStandardApp {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session1 = null;
		try {
			session1 = sessionFactory.openSession();
//			Query query = session1.createQuery("From Student", Student.class);
//			Query<Student> query = session1.createQuery("From Student WHERE sCity=:city", Student.class);
//			Query<String> query = session1.createQuery("SELECT sName From Student WHERE sCity=:city", String.class);
			Query<String> query = session1.createQuery("SELECT sName From Student WHERE sCity in (:city1, :city2)", String.class);
			query.setParameter("city1", "Nashik");
			query.setParameter("city2", "Mumbai");
			List<String> list = query.list();
			list.forEach(x-> System.out.println(x));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session1.close();
			sessionFactory.close();
		}


	}

}
