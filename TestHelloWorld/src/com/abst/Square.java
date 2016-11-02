package com.abst;

public class Square  extends Shape{

	double side;
	
	public Square(double d) {
		this.side =d;
	}


	@Override
	public double getArea() {
		return side*side;
	}
	

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	
}
