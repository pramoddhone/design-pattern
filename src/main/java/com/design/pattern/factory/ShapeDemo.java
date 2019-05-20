package com.design.pattern.factory;

public class ShapeDemo {

	public static void main(String[] args) {
		
		// Creating and Printing CIRCLE object
		Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
		shape.draw();
		shape.getDetails();
		
		// Creating and Printing QUADRILATERAL object
		shape = ShapeFactory.getShape(ShapeType.QUADRILATERAL);
		shape.draw();
		shape.getDetails();
		
		// Creating and Printing TRIAGLE object
		shape = ShapeFactory.getShape(ShapeType.TRIAGLE);
		shape.draw();
		shape.getDetails();

	}

}
