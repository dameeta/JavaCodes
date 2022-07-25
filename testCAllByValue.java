package com.pack.oops;

public class testCAllByValue {
	int x1, y1;
	public testCAllByValue (int c,int v) {
		
		this.x1=c;
		this.y1=v;
	}
	public void swap(int x,int y)
	{
		
		  System.out.println("Before swapping: x:" + x +"y:"+y); 
		  int temp;
		  temp=this.x1; 
		  this.x1=this.y1; 
		  this.y1=temp;
		  //temp=0;
		  System.out.println("After swapping: x:" + x + "y:"+y+"temp"+temp);
		 
		
		
	}
	public static void main(String [] args)
	{
		testCAllByValue tac=new testCAllByValue(5,6);
		System.out.println(tac.x1);
		System.out.println(tac.y1);
		tac.swap(3,4);
		System.out.println(tac.x1);
		System.out.println(tac.y1);
	}

}
