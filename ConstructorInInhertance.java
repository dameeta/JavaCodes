package com.pack.oops;
class FirstUpper{
	
	public FirstUpper()
	{
		System.out.println("Inside FirstUpper..");
	}	
}

class SecondUpper extends FirstUpper{
	public SecondUpper()
	{
		//System.out.println("Inside SecondUpper..");
	}	
}

class ThirdUpper extends  SecondUpper{
	public ThirdUpper()
	{
	//	super();
//implicitely super class constructor
		System.out.println("Inside ThirdUpper..");
	}	
	
	
}


public class ConstructorInInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThirdUpper thup=new ThirdUpper();
		
		
	}

}
