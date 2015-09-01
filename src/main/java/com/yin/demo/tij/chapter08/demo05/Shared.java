package com.yin.demo.tij.chapter08.demo05;

public class Shared {
	private int refCount = 0;
	private static long counter;
	private final long id = counter++;

	public Shared() {
		System.out.println("Creating " + this);
	}

	public void addRedf() {
		refCount++;
	}

	protected void dispose() {
		if (--refCount == 0) {
			System.out.println("Disposing " + this);
		}
	}

	public String toString() {
		return "Shared " + id;
	}
}
