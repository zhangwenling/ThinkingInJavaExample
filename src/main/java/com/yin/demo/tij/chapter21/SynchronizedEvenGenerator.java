package com.yin.demo.tij.chapter21;
/**
 * 
 * @author 尹逊志
 * @time 2015年8月6日下午11:08:20
 *
 */
public class SynchronizedEvenGenerator extends IntGenerator {
	private int currentEvenValue = 0;

	public synchronized int next() {
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}

	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator());
	}
}
