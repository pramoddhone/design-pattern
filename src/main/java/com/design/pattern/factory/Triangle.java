package com.design.pattern.factory;

public class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Triangle");

	}

	@Override
	public void getDetails() {
		System.out.println("This is the triangle object");

	}

}
