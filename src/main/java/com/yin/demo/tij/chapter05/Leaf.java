package com.yin.demo.tij.chapter05;

/**
 * Simple use of the 'this' keyword
 * 
 * @author 尹逊志
 * @time 2015年7月9日下午11:27:14
 * 
 */
public class Leaf {
	int i = 0;

	Leaf increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i=" + i);
	}

	public static void main(String[] args) {
		Leaf leaf = new Leaf();
		leaf.increment().increment().increment().print();
	}
}
