package com.test;


public class Test {
	public static void main(String[] args) {
		
		//1.实例化一个观察者
		 Observer girl=new Observer();
		 girl.setObserName("女票");
		 Observer monther=new Observer();
		 monther.setObserName("老妈");
		     
		//2.实例化一个目标
		  Subject weather=new Subject();
		  weather.setSendContent("今天出太阳了");
		   
		//3.目标注册观察者
		     weather.addObserver(monther);
		     weather.addObserver(girl);
		//4.目标发布通知
		     weather.notifyObserver();
		
	}

}
