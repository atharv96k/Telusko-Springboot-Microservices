package com.master.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.master.model.StudentInfo;


public class LaunchStandardApp {

    public static void main(String[] args) {
        Configuration config = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;
        FileInputStream fis = null;
        byte image[] = null;
        FileReader reader = null;
        char textFile[] = null;
        
        config = new Configuration();
        config.configure();
        config.addAnnotatedClass(StudentInfo.class);
        sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();

        try 
        {
			fis = new FileInputStream("C:\\Users\\HELLO\\Documents\\notes\\img.png");
			image = new byte[fis.available()];
			fis.read(image);
			
			File file = new File("C:\\Users\\HELLO\\Documents\\notes\\new.txt");
			reader = new FileReader(file);
			textFile = new char[(int)file.length()];
			reader.read(textFile);
		} catch (FileNotFoundException e) 
        {
			e.printStackTrace();
		}catch (Exception e) 
        {
			e.printStackTrace();
		}
        
        StudentInfo student = new StudentInfo();
        student.setsName("Atharv");
        student.setsCity("Japan");
        student.setImage(image);
        student.setText(textFile);
        try {    
            transaction = session.beginTransaction();
            session.persist(student);
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
