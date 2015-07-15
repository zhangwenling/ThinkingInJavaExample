package com.yin.demo.tij.chapter05;

/**
 * 
 * @author 尹逊志
 * @time 2015年7月9日下午11:36:00
 * 
 */
public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}

class Person {
	public void eat(Apple apple) {
		System.out.println("Yummy");
	}
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		return apple;
	}
}
