package com.yin.demo.tij.chapter21;
/**
 * 将Runnable对象转换为工作任务的传统方式是把它提交给一个Thread构造器
 * 
 * 代码分析：
 * 调用Thread对象的start()方法为该线程执行必需的初始化操作，然后调用Runnable的run()方法，</br>
 * 以便在这个新线程中启动该任务
 * 
 * @author 尹逊志
 * @time 2015年7月27日下午11:54:45
 *
 */
public class BassicThreads {
	public static void main(String[] args) {
		Thread t = new Thread(new ListOff());
		t.start();
		System.out.println("Waiting for ListOff");
	}
}
