package com.yin.demo.tij.chapter21;

import java.util.concurrent.TimeUnit;
/**
 * 所谓后台线程,是指在程序运行时的时候在后台提供一种通用服务的线程，并且这种线程并不属于程序中
 * 不可或缺的部分。因此，当所有的非后台线程结束时，程序也就终止了，同时会杀死进程中的所有后台线程。
 * 反过来说，只要有任何非后台线程还在运行，程序就不会终止。比如执行main()的就是一个非后台线程
 * 
 * @author yixunzhi
 * @createdTime 2015年7月31日下午8:16:29
 *
 */
public class SimpleDaemons implements Runnable {
	
	public void run() {
		try {
			while(true){
				TimeUnit.MICROSECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" :" +this);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++){
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);
			daemon.start();
		}
		System.out.println("All daemons started");
		TimeUnit.MICROSECONDS.sleep(17500);
	}
}
