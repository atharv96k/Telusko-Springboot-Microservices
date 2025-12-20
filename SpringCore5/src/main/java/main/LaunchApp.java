package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Employee;

public class LaunchApp 
{
	public static void main(String[] args) 
	{
		//Example 1
//		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
//		
//		Employee emp1 = container.getBean(Employee.class);
//		System.out.println(emp1);
//		System.out.println(emp1.employeeTask());
//		System.out.println("");
//		System.out.println("***********************************");
//		System.out.println("");
//		Employee emp2 = container.getBean(Employee.class);
//		System.out.println(emp2);
//		System.out.println(emp2.employeeTask());
		
		//Example 2
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig2.xml");
		
		Employee emp1 = container.getBean(Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.employeeTask());
		System.out.println("");
	}
}

