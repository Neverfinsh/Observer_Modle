package com.test;
import java.util.ArrayList;
import java.util.List;


/***
 * 
 * 功能:目标 
 * 注册、删除、通知观察者
 * 
 * @author Lw
 * 2017年7月30日
 *
 */
public class Subject {
	
   private List<Observer> observers=new ArrayList<Observer>();
    //目标发送的消息的通知
   private String SendContent;
   //

	public String getSendContent() {
	return SendContent;
   }
	
	
   public void setSendContent(String sendContent) {
	SendContent = sendContent;
   }
	//注册观察者;
	public void addObserver(Observer objserver){
		observers.add(objserver);
	}
   //删除一个观察者
	public  void delObserver(Observer objserver){
		observers.remove(objserver);
	}
   //
	public void notifyObserver(){
		for (Observer observer : observers) {
  //      通知所有的观察者
			//observer.update(this);//通知的方法;
		}
	}
}
