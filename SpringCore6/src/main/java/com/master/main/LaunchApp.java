package com.master.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.master.main.config.JavaConfiguration;

public class LaunchApp 
{
	public static void main(String[] args) 
	{
//		First Approach(Eager Initialization)
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Master m = context.getBean(Master.class);
		m.buyTheCourse(567567.7);
		}
	}

