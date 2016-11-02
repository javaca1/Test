package com.abst;

public class Circle extends Shape{
	
	double radius;

	public Circle(double d) {
		this.radius = d;
	}

	@Override
	public double getArea() {
		
		return Math.PI* radius *radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
