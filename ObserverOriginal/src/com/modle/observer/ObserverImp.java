package com.modle.observer;

import com.modle.subject.Subject;
import com.modle.subject.SubjectImp;

public class ObserverImp implements  Observer {
 
	
	
	private  String observerName;
	//从目标出获取;
    private  String weathercontent;
    
    private  String remindThings;
   	
       
//	private String observerState;

public String getObserverName() {
	return observerName;
}

public void setObserverName(String observerName) {
	this.observerName = observerName;
}

public String getWeathercontent() {
	return weathercontent;
}

public void setWeathercontent(String weathercontent) {
	this.weathercontent = weathercontent;
}

public String getRemindThings() {
	return remindThings;
}

public void setRemindThings(String remindThings) {
	this.remindThings = remindThings;
}


	@Override
	public void update(Subject subject) {
//		 TODO Auto-generated method stub
        // observerState=((SubjectImp)subject)
		//获取一些天气 变量 的 信息。
		weathercontent=((SubjectImp)subject).getWeatherContent();
           System.out.println(observerName+"收到了"+weathercontent+remindThings);
	}

}
