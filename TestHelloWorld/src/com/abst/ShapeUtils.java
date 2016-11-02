package com.abst;

public class ShapeUtils {
	
	
	public static double computeArea(Shape[] shapes){
		double sumArea =0;
		
		for(Shape sh : shapes){
			sumArea = sumArea + sh.getArea(); 
		}
		
		return sumArea;
	}
	
public static void main(String[] args) {
	Shape cir = new Circle(4.0);
	Shape rect = new Rectangle(5.0,6.0);
	Shape sq = new Square(7.0);
	
	Shape[] shapeArray = new Shape[3];
	shapeArray[0] = cir;
	shapeArray[1] = rect;
	shapeArray[2] = sq;
	
	
	double area = computeArea(shapeArray);
	
	System.out.println("Area Sum: "+area);
	
//	System.out.println("cir.getArea():"+cir.getArea());
//	System.out.println("rect.getArea():"+rect.getArea());
//	System.out.println("sq.getArea():"+sq.getArea());
//	System.out.println(cir.getArea()+rect.getArea()+sq.getArea());
}
}
