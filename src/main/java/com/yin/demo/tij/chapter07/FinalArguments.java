package com.yin.demo.tij.chapter07;
/**
 * final参数示例
 * Java允许在参数列表中以声明的方式将参数指明为final.
 * 这意味着你无法在方法中更改参数引用所指向的对象
 * 
 * @author yixunzhi
 * @createdTime 2015年7月16日下午8:27:33
 *
 */
public class FinalArguments {
	void with(final Gizmo g) {
		// g = new Gizmo;// g is final,can't change
	}

	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}

	int g(final int i) {
		// i++;//i is final,cannot change
		return i + 1;

	}
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(new Gizmo());
		Gizmo g = new Gizmo();
		bf.with(g);
	}
}

class Gizmo {
	public void spin() {
		System.out.println("Gizmo.spin");
	}
}
