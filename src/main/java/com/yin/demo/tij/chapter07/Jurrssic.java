package com.yin.demo.tij.chapter07;

/**
 * final类示例 对类使用final修饰符，就表明这个类不能被继承是final的。因此在final类 可以给方法添加final修饰词，但这不会增添任何意义
 * 
 * 由于final类禁止继承，所以final类中所有的方法都隐式的指定为
 * 
 * @author yixunzhi
 * @createdTime 2015年7月16日下午9:17:54
 * 
 */
public class Jurrssic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}

class SmallBrain {

}

final class Dinosaur {
	int i = 7;
	int j = i;
	SmallBrain x = new SmallBrain();

	void f() {
	}
}

// class Further extends Dinosaur{}
// can not extend final class "Dinosaur"

