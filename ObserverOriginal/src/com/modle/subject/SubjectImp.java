package com.modle.subject;

public class SubjectImp extends Subject{

//目标的天气的	
private String weatherContent;


public String getWeatherContent() {
	return weatherContent;
}

public void setWeatherContent(String weatherContent) {
	this.weatherContent = weatherContent;
	//内容有了,继续了父类所有的方法;
	this.notifyObserver();
}



	
	
}
