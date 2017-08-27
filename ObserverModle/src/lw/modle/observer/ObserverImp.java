package lw.modle.observer;

import java.util.Observable;
import java.util.Observer;

import lw.modle.subject.SubjectImp;

/***
 * 
 * 类名:
 * 功能:观察者;实现其接口
 * 
 * @author Lw
 * 2017年7月30日
 *
 */
public class ObserverImp implements Observer {

	
	//定义一个Observer者的姓名；
	private String obserName;
	
	/*****
	 * 自动更新的的模式开发;
	 * Observervale   :推模式 
	 * Obj            :  拉模式开发
	 * 
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
        //  用来接受更新的消息；
		System.out.println("拉模式.....:"+"观察者"+obserName+"接受了消息，内容是"+arg);
		System.out.println("推模式.....:"+"观察者"+obserName+"接受了消息，内容是"+((SubjectImp)o).getSubjectName());

	}

//   给外面进行获取
	public String getObserName() {
		return obserName;
	}
// 复制使用
	public void setObserName(String obserName) {
		this.obserName = obserName;
	}

}
