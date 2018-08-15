package com.offcm;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jobs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-task.xml");
	context.start();
	try {
		System.in.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
