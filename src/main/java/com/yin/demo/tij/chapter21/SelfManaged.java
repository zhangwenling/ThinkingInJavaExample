package com.yin.demo.tij.chapter21;

/**
 * 自管理的Runnable,与继承的区别在于，实现接口使得你可以继承另一个不同的类
 * start()是在构造器中调用的。应该意识到，在构造器中启动线程可能会变得很有问题，因为
 * 另一个任务可能会在构造器结束之前开始执行，这意味着该任务能够访问处于不稳定状态的对象
 * 
 * @author yixunzhi
 * @createdTime 2015年8月1日上午11:19:40
 * 
 */
public class SelfManaged implements Runnable {
	private int countDown = 5;
	private Thread t = new Thread(this);

	public SelfManaged() {
		t.start();
	}

	public String toString() {
		return "SelfManaged [countDown=" + countDown + ", t="
				+ Thread.currentThread().getName() + "]";
	}

	public void run() {
		while (true) {
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
		}

	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new SelfManaged();
		}
	}
}
