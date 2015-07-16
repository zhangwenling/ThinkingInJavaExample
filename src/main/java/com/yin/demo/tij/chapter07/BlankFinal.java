package com.yin.demo.tij.chapter07;

/**
 * 空白final示例 所谓空白final是指被声明为final但又为给定初值的域。 
 * 无论什么情况,编译器都确保空白<Strong>final在使用前必须被初始化</Strong>
 * 
 * 为什么使用空白final 空白final在关键字的使用上提供了更大的灵活性。为此，一个类中的final域就可以做到
 * 根据对象有所不同，却又保持其恒定不变的特性
 * 
 * @author yixunzhi
 * @createdTime 2015年7月16日下午8:03:15
 * 
 */
public class BlankFinal {
	private final int i = 0;
	private final int j;// Blank final
	private final Poppet p;// Blank final reference

	public BlankFinal() {
		System.out.println("无参构造器");
		this.j = 1;
		this.p = new Poppet(1);
		System.out.println("i=" + i + ":p=" + p);
	}

	public BlankFinal(int x) {
		System.out.println("带参构造器");
		this.j = x;
		this.p = new Poppet(x);
		System.out.println("i=" + i + ":p" + p);
	}

	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);
		// new BlankFinal().j = 5;//the final field cannot be assigned
	}

}

class Poppet {
	private int i;

	Poppet(int ii) {
		i = ii;
	}

	@Override
	public String toString() {
		return ".i=" + i;
	}
}