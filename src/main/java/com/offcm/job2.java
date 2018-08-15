package com.offcm;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class job2 {
	
	@Scheduled(cron="0/5 * * * * ?")	
	public void test8(){
		System.out.println("作业8执行中:"+new Date().toLocaleString());

	}}
