package com.yin.demo.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 线程的优先级将该线程的重要性传递给了调度器。尽管CPU处理现有线程集的顺序是不确定的，但是调度器将
 * 倾向于让优先级最高的线程先执行。然而这并不意味着优先权较低的线程将得不到执行(也就是说，优先权不会导致死锁)
 * 
 * 在绝大多数时间,所有线程都应该以默认的优先级运行.试图操纵线程优先级通常是一种错误
 * @author yixunzhi
 * @createdTime 2015年7月31日下午7:46:10
 *
 */
public class SimplePriorities implements Runnable {
	private int countDown = 5;
	private volatile double d;
	private int priority;

	public SimplePriorities(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return Thread.currentThread() + ":" + countDown;
	}

	public void run() {
		Thread.currentThread().setPriority(priority);
		while (true) {
			for (int i = 1; i < 100000000; i++) {
				d += (Math.PI + Math.E) / (double) i;
				if (i % 1000 == 0) {
					Thread.yield();
				}
			}
			System.out.println(this);
			if (--countDown == 0){
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++){
			exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		}
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.shutdown();
	}

}
