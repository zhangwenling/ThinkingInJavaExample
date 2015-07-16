package com.yin.demo.tij.chapter07;
/**
 * final和private关键字示例
 *  1.final方法使用原因
 *  第一：把方法锁定，以防任何继承类修改它的含义。处于设计的考虑，想要确保在继承中
 *  使方法行为保持不变，并且不会被覆盖
 *  第二：从效率考虑.如果将一个方法指明为final,就是同意编译器将针对该方法的所有调用
 *  都转为内嵌调用。当编译器发现一个final方法调用命令时，它会根据自己的谨慎判断，跳过
 *  插入程序代码这种正常方式而执行方法调用机制(将参数入栈，调至方法代码吃并执行，然后跳回并清理栈中的参数，处理返回值)
 *  ，并且以方法体中的实际代码的副本来代替方法调用。这将消除方法调用的开销。
 *  
 *  在最近的java版本中，虚拟机(特别是hotspot技术)可以探测到这些情况，并优化去掉这些效率反而降低的额外的内嵌调用，因此不需要使用
 *  final方法来进行优化了。
 *  
 *  <strong>只有在想要明确禁止覆盖时，才将方法设置为final</strong>
 *  
 * 类中所有的private方法都隐式的指定为是final.可以对private 方法添加final修饰词，但这并不能增加额外的意义
 * 
 * @author yixunzhi
 * @createdTime 2015年7月16日下午8:52:01
 *
 */
public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
//		op.f();
//		op.g();
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OveridingPrivate.f()");
	}

	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OveridingPrivate2.f()");
	}

	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

class WithFinals {
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	private void g() {
		System.out.println("WinthFinals.g()");
	}
}
