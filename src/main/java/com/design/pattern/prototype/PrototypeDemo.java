package com.design.pattern.prototype;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BlueColor blueColor = new BlueColor();
		blueColor = (BlueColor) blueColor.clone();
		blueColor.addColor();

	}

}
