package com.example.demo.spring_bean_scope;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Singletondemo")
//@Scope("singleton")
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)//standard way of declaration and 
//if we don't declare also it will take default as singleton
public class SingletonDemo {

}
