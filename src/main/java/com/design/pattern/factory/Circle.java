package com.design.pattern.factory;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public void getDetails() {
		System.out.println("This is Circle");

	}

}
