package com.pack.oops;
public class BasicShape {
	public int CalArea(int l,int b)
	{
		System.out.println("Printing area of Reactangle..");
		return l*b;
	}
	public int CalArea(int side)
	{
		System.out.println("Printing area of Square..");
		return  side*side;
	}
	public double CalArea(double r)
	{
		System.out.println("Printing area of Circle..");
		return 3.14*r*r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicShape rectangle=new BasicShape();
		System.out.println(rectangle.CalArea(3,9));
		//BasicShape square=new BasicShape();
		System.out.println(rectangle.CalArea(3));
		//BasicShape circle=new BasicShape();
		System.out.println(rectangle.CalArea(1.2));
		
	}

}
