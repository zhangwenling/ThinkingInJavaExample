package com.yin.demo.tij.chapter08.demo04;

public class Amphibian extends Animal{
	private Characteristic p = new Characteristic("is alive");
	private Description d = new Description("is alive");

	public Amphibian() {
		System.out.println("Amphibian() is creating");
	}

	protected void dispose() {
		System.out.println("Amphibian dispose");
		d.dispose();
		p.dispose();
	}
}
