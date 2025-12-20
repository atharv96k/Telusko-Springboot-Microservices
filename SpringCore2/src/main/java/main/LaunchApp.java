package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp 
{
	public static void main(String[] args) 
	{
//		First Approach(Eager Initialization)
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
//		Second Approach(Lazy Initialization)
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		
		reader.loadBeanDefinitions("applicationconfig.xml");
		Master m = beanFactory.getBean(Master.class);
		
		 boolean status = m.buyTheCourse(2999.0);
		 
			if (status)
				System.out.println("Course enrolled successfully!");
			else
				System.out.println("Failed to enroll the course");
		}
	}

