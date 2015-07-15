package com.yin.demo.tij.chapter05;

public class OrderOfInitialValues {
	public static void main(String[] args) {
		House house = new House();
		house.f();
	}
}

class Window{
	Window(int marker){
		System.out.println("Window("+marker+")");
	}
}

class House{
	Window w1 = new Window(1);
	House(){
		System.out.println("House()");
		w3 = new Window(33);
	}
	public void f() {
		System.out.println("f()");
	}
	Window w2 = new Window(2);
	Window w3 = new Window(3);
}

