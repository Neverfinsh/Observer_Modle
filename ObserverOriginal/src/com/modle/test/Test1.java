package com.modle.test;

import com.modle.observer.ObserverImp;
import com.modle.subject.Subject;
import com.modle.subject.SubjectImp;

public class Test1 {
	
	public static void main(String[] args) {
		
		//实例化一个目标，即订阅的天气;
		SubjectImp weather=new SubjectImp();
		//实例化一个观察者
		ObserverImp girl=new ObserverImp();
		girl.setObserverName("女朋友");
		girl.setRemindThings("带伞");
		
		ObserverImp m=new ObserverImp();
		m.setObserverName("老妈");
		m.setRemindThings("出去逛街");
	   //注册的观察者模式
		weather.addObserver(girl);
		weather.addObserver(m);
		//发布通知
		weather.setWeatherContent("出太阳了");
	}

}
