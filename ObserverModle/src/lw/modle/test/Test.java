package lw.modle.test;

import lw.modle.observer.ObserverImp;
import lw.modle.subject.SubjectImp;

/*****
 * 
 * 类名:测试类;
 * 功能:
 * @author Lw
 * 2017年7月30日
 *
 */
public class Test {
     public static void main(String[] args) {
         //实例化一个观察者    	 
         ObserverImp girl=new ObserverImp();
         girl.setObserName("小明的女朋友");
         
         ObserverImp mom=new ObserverImp();
         mom.setObserName("小明的老妈");

        //实例化一个目标；
         SubjectImp weather =new SubjectImp();
         //添加观察者
           weather.addObserver(mom);
           weather.addObserver(girl);
          //发通知
           weather.setSubjectName("今天出太阳了");
        		  
	
  }
}
