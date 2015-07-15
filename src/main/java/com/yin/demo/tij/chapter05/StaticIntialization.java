package com.yin.demo.tij.chapter05;
/**
 * 由输出可见，静态初始化只有在必要时刻才会进行。如果不创建Table对象，也不引用Table.b1或Table.b2,那么静态的Bowl b1和b2永远不会
 * 被创建。只有在第一个Table对象被创建(或者第一次访问静态数据)的时候，他们才会被初始化。此后，静态对象不会再次被初始化
 * 
 * 初始化的顺序是先静态对象(如果它们尚未因前面的对象创建过程而被初始化)，而后是"非静态对象"
 * @author 尹逊志
 * @time 2015年7月14日上午12:02:23
 *
 */
public class StaticIntialization {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cuppboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}

	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}

class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}

	void f1(int marker) {
		System.out.println("f1(" + marker + ")");
	}
}

class Table {
	static Bowl bowl = new Bowl(1);

	Table() {
		System.out.println("Table()");
		bowl2.f1(1);
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}

	static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);

	Cupboard() {
		System.out.println("Cupboard");
		bowl4.f1(2);
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

	static Bowl bowl5 = new Bowl(5);
}