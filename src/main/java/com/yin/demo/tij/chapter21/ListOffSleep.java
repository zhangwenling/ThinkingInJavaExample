package com.yin.demo.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 影响任务的一种简单方法是调用sleep()，这将使任务终止执行给定的时间。
 * 
 * @author 尹逊志
 * @time 2015年7月27日下午11:26:09
 * 
 */
public class ListOffSleep implements Runnable {
	protected int countCown = 10;// Default
	private static int taskCount = 0;
	private final int id = taskCount++;// 1标识符用来区分任务的多个实例，它是final的，一旦初始化就不希望被改变

	public ListOffSleep() {

	}

	public ListOffSleep(int countCown) {
		this.countCown = countCown;
	}

	public String status() {
		return "#" + id + "(" + (countCown > 0 ? countCown : "ListOff!") + ").";
	}

	public void run() {
		try {
			while (countCown-- > 0) {
				System.out.print(status());
				Thread.sleep(100);
				TimeUnit.MILLISECONDS.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println("Interrupted");
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new ListOffSleep());
		}
		exec.shutdown();
	}

}
