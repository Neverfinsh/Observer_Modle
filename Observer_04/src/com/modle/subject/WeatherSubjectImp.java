package com.modle.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;



public class WeatherSubjectImp  extends WeatherSubject{

   private String weatherContent;
   
  
  
	public String getWeatherContent() {
	return weatherContent;
}

public void setWeatherContent(String weatherContent) {
	this.weatherContent = weatherContent;
}

	@Override
	protected  void notetifyObservers() {
		//循环所有的注册的
   	for( Observer observer:observers){
   	//进行条件的判断
		
	}
		
	}

}
