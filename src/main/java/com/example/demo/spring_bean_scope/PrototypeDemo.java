package com.example.demo.spring_bean_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypedemo")
@Scope("prototype")
public class PrototypeDemo {
	

}
