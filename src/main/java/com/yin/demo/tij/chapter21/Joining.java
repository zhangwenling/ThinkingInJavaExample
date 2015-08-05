package com.yin.demo.tij.chapter21;
/**
 * 一个线程可以再其他县城智商调用join()方法,其效果是等待一段时间直到第二个线程结束才继续执行。如果某个县城在另一个线程t上调用
 * t.join(),此线程将被挂起,直到目标线程t结束才恢复
 * 
 * @author yixunzhi
 * @createdTime 2015年8月5日上午10:54:28
 *
 */
public class Joining {
	public static void main(String[] args) {
		Sleeper sleepy = new Sleeper("Sleepy", 1500);
		Sleeper grumpy = new Sleeper("Grumpy",1500);
		Joiner doper = new Joiner("Dopey",sleepy);
		Joiner doc = new Joiner("Doc", grumpy);
		grumpy.interrupt();
	}
}

class Sleeper extends Thread {
	private int duration;

	public Sleeper(String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}

	@Override
	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			System.out.println(getName() + "was interrupted."
					+ "isInterrupted():" + isInterrupted());
			return;
		}
		System.out.println(getName()+"has awakened");
	}
}

class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper sleeper){
		super(name);
		this.sleeper = sleeper;
		start();
	}
	
	@Override
	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+"join completed");
	}
}