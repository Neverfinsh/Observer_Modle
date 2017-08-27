package lw.modle.subject;

import java.util.Observable;


/****
 * 
 * 类名:目标的抽象类
 * 功能:1.定义目标的封装的特性
 * @author Lw
 * 2017年7月30日
 * TODO:如果添加多个目标
 *
 */
public class SubjectImp extends Observable {
	
	private String subjectName;
	

	public String getSubjectName() {
		return subjectName;
	}
	
    //赋值时执行的操作
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
		//发生改变是进行通知 ;
		this.setChanged();
		//通知所有的人：广播模式：推模式
		this.notifyObservers();
		//拉模式：传应用
//		this.notifyObservers(subjectName);
	}
	
	

}
