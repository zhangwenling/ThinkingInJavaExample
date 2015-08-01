package com.yin.demo.tij.chapter21;
/**
 * 继承Thread复写run()方法来实现线程
 * 
 * @author yixunzhi
 * @createdTime 2015年8月1日上午11:14:41
 *
 */
public class SimpleThread extends Thread{
	private static int threadCount = 0;
	private int countDown = 5;
	public SimpleThread(){
		super(Integer.toString(++threadCount));
		start();
	}
	@Override
	public String toString() {
		return "#"+getName()+"("+countDown+").";
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println(this);
			if(--countDown == 0){
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			new SimpleThread();
		}
	}
}
