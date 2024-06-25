package com.example.demo.spring_bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		SingletonDemo singleton = context.getBean("Singletondemo",SingletonDemo.class);
		
		SingletonDemo singleton1 = context.getBean("Singletondemo",SingletonDemo.class);
		
		System.out.println(singleton.hashCode() +" "+ singleton1.hashCode());
		
		
		PrototypeDemo ptype = context.getBean("prototypedemo",PrototypeDemo.class);
		PrototypeDemo ptype1 = context.getBean("prototypedemo",PrototypeDemo.class);
		
    System.out.println(ptype.hashCode() +  " "+ ptype1.hashCode());
    
    
    Student student = context.getBean("student",Student.class);
    student.setName("Krishna K");
    System.out.println("Student name :"+student.getName());
    
    Student student1 = context.getBean("student",Student.class);
    System.out.println("Another student :"+student1.getName());
		
    System.out.println("This is example of bean scope");
		

		
		
	}

}
