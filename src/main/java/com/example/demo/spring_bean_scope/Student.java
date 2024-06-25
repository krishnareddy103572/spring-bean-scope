package com.example.demo.spring_bean_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	
	String name;
	
	Student(){
		System.out.println("Student object called");
	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
