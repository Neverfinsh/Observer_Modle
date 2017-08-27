package com.test;


public class Observer {
	
  private String obserName;
  //obserGet 来自目标发送的消息
  private String obserGet;
  
  

public String getObserGet() {
	return obserGet;
}

public void setObserGet(String obserGet) {
	this.obserGet = obserGet;
}


public String getObserName() {
	return obserName;
}

public void setObserName(String obserName) {
	this.obserName = obserName;
}
  


//观察者的通知更新的方法:目标发布的最新的动态消息

  public void update(Subject subject){
	  
	 System.out.println(obserName+"接受到了"+subject.getSendContent());
  }

	
}
