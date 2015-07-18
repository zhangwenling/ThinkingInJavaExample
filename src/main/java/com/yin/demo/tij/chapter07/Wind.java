package com.yin.demo.tij.chapter07;

/**
 * 向上转型示例 "为新的类提供方法"并不是继承技术中最重要的方面，其最重要的方面是用来表现新类和基类之间的关系。这种
 * 关系可以用"新类是现有类的一种类型"这句话概括
 * 
 * 下例中。tune()方法可以接受Instrument引用。鉴于Java类型的检查十分严格,接受某种类型的方法
 * 同样可以接受另外一种类型就会显得很奇怪，除非你意识到Wind对象同样也是一种Instrument对象，
 * 而且也不存在任何tune()方法是可以通过Instrument来调用，同事又不存在于Wind之中。
 * 在tune()中，程序代码可以对Instrument和它所有的导出类起作用，这种将Wind引用转换为Instrument引用的 动作，我们称之为向上转型
 * 
 * 
 * 为什么称为向上转型 由导出类转型为基类，在继承图上市向上移动的，因此称为向上转型。由于向上转型是从一个较专用类型向较通用类型转换，所以总是安全的
 * 
 * @author yixunzhi
 * @createdTime 2015年7月18日下午6:41:23
 * 
 */
public class Wind extends Instrument {
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute);
	}
}

class Instrument {
	public void play() {

	}

	static void tune(Instrument i) {
		System.out.println("something is doing");
		i.play();
	}
}