package com.design.pattern.prototype;

public abstract class Color implements Cloneable {
	protected String color;

	public abstract void addColor();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
