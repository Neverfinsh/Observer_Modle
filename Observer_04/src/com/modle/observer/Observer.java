package com.modle.observer;

import com.modle.subject.WeatherSubject;


public interface Observer {
	//更新的接口
	public void update(WeatherSubject weathersubject);
    //
	public void setObserNamer();
	//
	public String getOseNamer();
}
