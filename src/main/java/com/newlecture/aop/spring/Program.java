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
		
		// Proxy를 생성해서 실제 주업무 로직을 위임.
		
		
		int data = cal.add(3, 4);
		 data =cal.div(3,1);  // 사전처리보조업무 print


		System.out.println(data);
		
		
		
		
		
		
		
		
	}

}
