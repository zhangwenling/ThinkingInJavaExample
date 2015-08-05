package com.yin.demo.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author 尹逊志
 * @time 2015年7月30日下午11:20:55
 *
 */
public class FixedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exec.execute(new ListOff());
		}
		exec.shutdown();
	}
}
