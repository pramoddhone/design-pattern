package com.design.pattern.factory;

public class ShapeFactory {

	public static Shape getShape(ShapeType shapeType) {
		if(shapeType == null) {
			return null;
		}else if(shapeType == ShapeType.CIRCLE) {
			return new Circle();
			
		}else if(shapeType == ShapeType.TRIAGLE) {
			return new Triangle();
		}else if(shapeType == ShapeType.QUADRILATERAL) {
			return new Quadrilateral();
		}
		return null;
	}
}
