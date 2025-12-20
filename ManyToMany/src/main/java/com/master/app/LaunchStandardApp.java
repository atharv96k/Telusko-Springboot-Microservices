package com.master.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.master.model.Courses;
import com.master.model.Students;

public class LaunchStandardApp {

    public static void main(String[] args) {
        Configuration config = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        try {
            config = new Configuration();
            config.configure();
            sessionFactory = config.buildSessionFactory();
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();
 
//            session.persist(s1);
            flag = true;
            
        } catch (HibernateError e) {
            e.printStackTrace();
            flag = false;
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        } finally {
            if (flag == true) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
        }
    }
}
