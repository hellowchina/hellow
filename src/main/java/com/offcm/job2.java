package com.offcm;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class job2 {
	
	@Scheduled(cron="0/5 * * * * ?")	
	public void test8(){
		System.out.println("��ҵ8ִ����:"+new Date().toLocaleString());

	}}
