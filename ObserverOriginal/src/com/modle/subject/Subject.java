package com.modle.subject;

import java.util.ArrayList;
import java.util.List;

import com.modle.observer.Observer;


/*****
 * 
 * 功能:Subject目标类;用来存储观察者(添加,注册和通知观察者);
 *  
 * @author Lw
 * 2017年7月30日
 *
 */
public class Subject {
	
private List <Observer> observers=new ArrayList<Observer>();

/*
 * 增加一个的观察者
 */

public void addObserver(Observer observer){
	observers.add(observer);
}

/**
 * 删除
 */
public void  delObserver(Observer observer){
	observers.remove(observer);
}

/**
 * 通知所有的观察者
 */
public void notifyObserver(){
	for (Observer observer : observers) {
//		TODO:少一个方法;
		observer.update(this);
	}
	
}

}
