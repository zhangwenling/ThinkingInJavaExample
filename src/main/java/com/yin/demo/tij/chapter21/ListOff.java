package com.yin.demo.tij.chapter21;

/**
 * 线程实现方式一：实现runnable接口 定义任务：实现Runnable接口并编写run()方法，使该任务可以执行命令
 * 
 * 代码分析： 1.id标识符 2.Thread.yield()的调用是对线程调度器的一种建议 2.Thread.yield()
 * 3.当从Runnable导出一个类时,它必须具有run()方法,但是它不会产生任何内在的线程能力。</br>
 * 要实现线程行为,你必须显示的将一个任务附着到线程上
 * 
 * @author 尹逊志
 * @time 2015年7月27日下午11:26:09
 * 
 */
public class ListOff implements Runnable {
	protected int countCown = 10;// Default
	private static int taskCount = 0;
	private final int id = taskCount++;// 1标识符用来区分任务的多个实例，它是final的，一旦初始化就不希望被改变

	public ListOff() {

	}

	public ListOff(int countCown) {
		this.countCown = countCown;
	}

	public String status() {
		return "#" + id + "(" + (countCown > 0 ? countCown : "ListOff!") + ").";
	}

	public void run() {
		while (countCown-- > 0) {
			System.out.print(status());
			// 2. Thread.yield()的调用是对线程调度器的一种建议,它在声明："我已经执行完生命周期中最重要的部分了，
			// 此刻正是切换给其他任务执行一段时间的大好时机。"
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		ListOff listOff = new ListOff();
		listOff.run();
	}

}
