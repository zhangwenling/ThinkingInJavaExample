package com.yin.demo.tij.chapter07;
/**
 * java组合语法示例
 * @author 201506160244
 *
 */
public class SprinklerSystem {
	private String value1,value2,value3,value4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	@Override
	public String toString() {
		return "SprinklerSystem [value1=" + value1 + ", value2=" + value2
				+ ", value3=" + value3 + ", value4=" + value4 + ", source="
				+ source + ", i=" + i + ", f=" + f + "]";
	}
	public static void main(String[] args) {
		SprinklerSystem sprinklerSystem = new SprinklerSystem();
		System.out.println(sprinklerSystem);
	}
}

class WaterSource{
	private String s;

	public WaterSource() {
		System.out.println("WaterSource()");
		this.s = "Constructed";
	}
	
	@Override
	public String toString() {
		return s;
	}
}