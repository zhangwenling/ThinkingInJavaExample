package com.yin.demo.tij.chapter08.demo05;

public class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRedf();
	}

	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}

	@Override
	public String toString() {
		return "Composing " + id;
	}
}
