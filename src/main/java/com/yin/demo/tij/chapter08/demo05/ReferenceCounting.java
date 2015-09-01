package com.yin.demo.tij.chapter08.demo05;

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composings = { new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for (Composing composing : composings) {
			composing.dispose();
		}
	}
}
