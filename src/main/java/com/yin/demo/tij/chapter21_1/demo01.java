package com.yin.demo.tij.chapter21_1;
/**
 * yield()方法使用示例
 * 
 * @author yixunzhi
 * @createdTime 2015年8月21日下午5:58:49
 *
 */
public class demo01 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Producer());
		Thread t2 = new Thread(new Consumer());
		t2.start();
		t1.start();
	}
}

class Producer implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I'm producer " + i);
			Thread.yield();
		}
	}
}

class Consumer implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I'm consumer " + i);
			Thread.yield();
		}
	}
}