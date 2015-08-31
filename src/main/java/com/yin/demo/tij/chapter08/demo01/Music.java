package com.yin.demo.tij.chapter08.demo01;

public class Music {
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
}
