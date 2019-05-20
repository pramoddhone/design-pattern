package com.design.pattern.prototype;

public class RedColor extends Color{

	public RedColor() {
		this.color = "Blue";
	}
	
	@Override
	public void addColor() {
		System.out.println("Red Color Added");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new BlueColor();
	}

}