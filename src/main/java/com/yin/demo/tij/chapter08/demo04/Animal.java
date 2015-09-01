package com.yin.demo.tij.chapter08.demo04;

public class Animal extends LivingCreature{
	private Characteristic p = new Characteristic("is alive");
	private Description d = new Description("is alive");

	public Animal() {
		System.out.println("Animal() is creating");
	}

	protected void dispose() {
		System.out.println("Animal dispose");
		d.dispose();
		p.dispose();
	}
}
