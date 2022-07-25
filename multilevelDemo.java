package com.test.inheritance;

class VeryBase{
	public VeryBase()
	{
		System.out.println("Inside VeryBase");
	}
	
}

class Base  extends VeryBase{
	protected int st_id;

	public Base()
	{
		System.out.println("Inside Base...");
		
	}
}
class Child extends Base
{
public Child()
{
System.out.println("Child constructor");	
}
 public void childMethod()
	{
	System.out.println(st_id);
	
	}
	

}
public class multilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch1=new Child();

		
	}

}
