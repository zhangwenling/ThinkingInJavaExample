package com.yin.demo.tij.chapter08.demo04;

public class Characteristic {
	private String s;

	public Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}

	protected void dispose() {
		System.out.println("disposing Character " + s);
	}
}
