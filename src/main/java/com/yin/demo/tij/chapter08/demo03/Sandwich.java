package com.yin.demo.tij.chapter08.demo03;


public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	private Sandwich() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich();
	}
}
