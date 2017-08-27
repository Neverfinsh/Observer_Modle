package com.modle.observer;

import com.modle.subject.Subject;


/****
 * 
 * 功能:定义观察者
 * 
 * @author Lw
 * 2017年7月30日
 *
 */
public interface Observer {
	public void update(Subject subject);//保存subject状态

}
