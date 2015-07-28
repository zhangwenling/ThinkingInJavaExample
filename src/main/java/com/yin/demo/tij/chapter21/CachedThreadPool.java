package com.yin.demo.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author 尹逊志
 * @time 2015年7月28日下午11:25:12
 *
 */
public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new ListOff());
		}
		exec.shutdown();
	}
}
