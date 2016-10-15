package com.xsr.demo.springQuartz;

import java.util.Date;

public class MyJob {
	public void work(){
		try {
			Thread.currentThread().sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello world!!!--" + "date:" + new Date().toString());
	}

}
