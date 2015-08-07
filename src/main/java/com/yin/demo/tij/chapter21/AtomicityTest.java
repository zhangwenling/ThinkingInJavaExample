package com.yin.demo.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicityTest implements Runnable {
	private int i = 0;

	private int getValue() {
		return i;
	}

	private void evenIncrement() {
		try {
			i++;
			Thread.sleep(100);
			i++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while (true) {
			evenIncrement();
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest at = new AtomicityTest();
		exec.execute(at);
		int val = at.getValue();
		if (val % 2 != 0) {
			System.out.println(val);
			System.exit(0);
		}
	}
}
