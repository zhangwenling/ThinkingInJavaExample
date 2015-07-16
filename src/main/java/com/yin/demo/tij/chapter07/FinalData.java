package com.yin.demo.tij.chapter07;

import java.util.Random;
/**
 * final数据示例
 * 许多变成语言都有某种方法,来向编译器告知一块数据是恒定不变的。
 * 有时数据的恒定不变时很有用的。比如
 * 1.一个永不改变的编译时常量
 * 2.一个在运行时被初始化的值，而你不希望它被改变
 * 对于编译期常量这种情况，编译器可以将该常量值代入任何可能用到它的计算式中，
 * 也就是说,可以再编译时执行计算式,这减轻了一些运行时的负担
 * 
 * 用时注意
 * 1.不变常量必须是基本类型，并且以关键字final表示
 * 2.在对常量进行定义的时候,必须对其进行赋值
 * 3.一个既是static又是final的域只占据一段不能改变的存储空间
 * 4.根据惯例既是static又是final的域将用大写表示
 * 5.当对对象运用final时，final使引用恒定不变.一旦引用被初始化指向一个对象
 * 就无法再把他改为指向另一个对象。但是对象自身是可以被修改的
 * @author yixunzhi
 * @createdTime 2015年7月16日下午5:52:28
 *
 */
public class FinalData {
	private static Random rand = new Random(47);
	private String id;

	public FinalData(String id) {
		this.id = id;
	}

	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 99;
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	private final int[] a = { 1, 2, 3, 4, 5, 6 };

	public String toString() {
		return id + ":" + "i4=" + i4 + ",INT_5=" + INT_5;
	}

	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		// fd1.valueOne++;//can't change value
		fd1.v2.i++;//Object isn't constant!
		//fd1.v2 = new Value(9);//final修饰的对象不能更改
		fd1.v1 = new Value(9);//v1 不是final
		for(int i =0 ;i<fd1.a.length;i++){
			fd1.a[i]++;//数组里面的属性是可以改变的
		}
//		fd1.VAL_3 = new Value(3);
//		fd1.a = new int[3];
		System.out.println(fd1);
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
	}

}

class Value {
	int i;

	public Value(int i) {
		this.i = i;
	}
}