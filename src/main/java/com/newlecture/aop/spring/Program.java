package com.newlecture.aop.spring;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/newlecture/aop/spring/aop-context.xml");
		Calculator cal = (Calculator) context.getBean("cal");
		//Calculator origin= new NewLecCalculator();
		
		// Proxy�� �����ؼ� ���� �־��� ������ ����.
		
		
		int data = cal.add(3, 4);
		 data =cal.div(3,1);  // ����ó���������� print


		System.out.println(data);
		
		
		
		
		
		
		
		
	}

}
