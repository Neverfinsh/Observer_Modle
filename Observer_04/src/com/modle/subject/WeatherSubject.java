package com.modle.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class WeatherSubject {
	//用来保存注册观察者对象
	
	protected List <Observer> observers=new ArrayList<Observer>();
	
	//添加
	public void addObserver(Observer observer){
		observers.add(observer);
	}
    //删除
	public void delObserver(Observer observer){
		observers.remove(observer);
	}
    //	
	protected  abstract  void notetifyObservers();
	

}
