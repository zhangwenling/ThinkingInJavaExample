package com.yin.demo.tij.chapter08.demo04;

public class Frog extends Amphibian{
	private Characteristic p = new Characteristic("is alive");
	private Description d = new Description("is alive");

	public Frog() {
		System.out.println("Frog() is creating");
	}

	protected void dispose() {
		System.out.println("Frog dispose");
		d.dispose();
		p.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
	}
}
