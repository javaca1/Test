package com.abst;

public class Rectangle extends Shape{
	
	double length, width;
	
	
	public Rectangle(double d, double e) {
		this.length = d;
		this.width =e;
	}

	@Override
	public double getArea() {
		return length * width;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	

}
