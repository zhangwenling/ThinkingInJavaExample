package com.yin.demo.tij.chapter08.demo04;

public class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description d = new Description("is alive");

	public LivingCreature() {
		System.out.println("LivingCreature() is creating");
	}

	protected void dispose() {
		System.out.println("LivingCreature dispose");
		d.dispose();
		p.dispose();
	}
}
