package com.yin.demo.tij.chapter05;
/**
 * 方法接受较小的基本类型作为参数。如果传入的实际参数较大，就得通过类型转换来执行窄化转换。如果不这样做，编译器就会报错
 * @author 尹逊志
 * @time 2015年7月9日上午12:31:17
 *
 */
public class Demotion {
	void f1(char x) {
		System.out.print("f1(char);");
	}

	void f1(byte x) {
		System.out.print("f1(byte);");
	}

	void f1(short x) {
		System.out.print("f1(short);");
	}

	void f1(int x) {
		System.out.print("f1(int);");
	}

	void f1(long x) {
		System.out.print("f1(long);");
	}

	void f1(float x) {
		System.out.print("f1(float);");
	}

	void f1(double x) {
		System.out.print("f1(double);");
	}
	
	void f2(char x) {
		System.out.print("f2(char);");
	}

	void f2(byte x) {
		System.out.print("f2(byte);");
	}

	void f2(short x) {
		System.out.print("f2(short);");
	}

	void f2(int x) {
		System.out.print("f2(int);");
	}

	void f2(long x) {
		System.out.print("f2(long);");
	}

	void f2(float x) {
		System.out.print("f2(float);");
	}

	void f3(char x) {
		System.out.print("f3(cahr);");
	}
	void f3(byte x) {
		System.out.print("f3(byte);");
	}
	void f3(short x) {
		System.out.print("f3(short);");
	}

	void f3(int x) {
		System.out.print("f3(int);");
	}

	void f3(long x) {
		System.out.print("f3(long);");
	}

	void f4(int x) {
		System.out.print("f4(int);");
	}

	void f4(short x) {
		System.out.print("f4(short);");
	}

	void f4(byte x) {
		System.out.print("f4(byte);");
	}

	void f4(char x) {
		System.out.print("f4(char);");
	}

	void f5(char x) {
		System.out.print("f5(char);");
	}

	void f5(byte x) {
		System.out.print("f5(byte);");
	}

	void f5(short x) {
		System.out.print("f5(short);");
	}

	void f6(char x) {
		System.out.print("f6(char);");
	}

	void f6(byte x) {
		System.out.print("f6(byte);");
	}

	void f7(char x) {
		System.out.print("f7(char);");
	}
	
	void testDouble(){
		double x = 5;
		f1(x);
		f2((float) x);
		f3((long) x);
		f4((int) x);
		f5((short) x);
		f6((byte) x);
		f7((char) x);
	}
	
	public static void main(String[] args) {
		Demotion d = new Demotion();
		d.testDouble();
	}
}
