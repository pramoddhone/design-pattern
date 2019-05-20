package com.design.pattern.factory;

public class Quadrilateral extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Quadrilateral");
	}

	@Override
	public void getDetails() {
		System.out.println("This is Quadrilateral");

	}

}
