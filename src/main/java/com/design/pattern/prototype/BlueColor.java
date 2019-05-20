package com.design.pattern.prototype;

public class BlueColor extends Color{

	public BlueColor() {
		this.color = "Blue";
	}
	
	@Override
	public void addColor() {
		System.out.println("Blue Color Added");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new BlueColor();
	}

}
