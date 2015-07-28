package com.yin.demo.tij.chapter21;
/**
 * 输出说明不同任务的执行在线程被换进换出时混在了一起。这种交换是有线程调度器自动控制的</br>
 * @author 尹逊志
 * @time 2015年7月28日下午11:12:32
 *
 */
public class MoreBasicThreads {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new ListOff()).start();
			System.out.println();
		}
		System.out.println("Waiting for ListOff");
	}
}
