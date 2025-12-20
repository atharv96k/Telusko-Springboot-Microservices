package com.master.app;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.master.model.StudentInfo;

public class LOBRetrieval {
public static void main(String[] args) {
	Configuration config = null;
	SessionFactory sessionFactory = null;
	Session session = null;  
	FileOutputStream fos = null;
	FileWriter writer = null;
	config = new Configuration();
	config.configure();
	config.addAnnotatedClass(StudentInfo.class);
	
	sessionFactory = config.buildSessionFactory();
	session = sessionFactory.openSession();
	@SuppressWarnings("removal")
	StudentInfo studentInfo = session.get(StudentInfo.class, 1);
	try {
		fos = new FileOutputStream("Java.png");
		writer = new FileWriter("new.txt");
		fos.write(studentInfo.getImage());
		writer.write(studentInfo.getText());
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			fos.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.clear();
		sessionFactory.close();
	}
}
}
