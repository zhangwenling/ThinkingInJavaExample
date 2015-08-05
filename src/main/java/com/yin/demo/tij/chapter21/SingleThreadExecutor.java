package com.yin.demo.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++){
			exec.execute(new ListOff());
		}
		exec.shutdown();
	}
}
