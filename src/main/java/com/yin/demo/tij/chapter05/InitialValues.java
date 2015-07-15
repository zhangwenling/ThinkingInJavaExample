package com.yin.demo.tij.chapter05;

public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues init;
	
	void printInitiaValues(){
		System.out.println("Data type    Initial value");
		System.out.println("boolean       "+t);
		System.out.println("char          "+c);
		System.out.println("int           "+i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(init);
	}
	
	public static void main(String[] args) {
		new InitialValues().printInitiaValues();
	}
	
	
	//可以通过两个某个方法提供初值
	int i1 = f();
	int f(){
		return 11;
	}
	
	//方法也可以带有参数，但这些参数必须是被初始化了的
	int i2 = f();
	int j = g(i2);
	int g(int i){
		return i *10;
	}
}
