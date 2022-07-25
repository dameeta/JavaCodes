package com.pack.oops;
class A1{
	int x=10;
	public A1(int xx)
	{
		this.x=xx;
		System.out.println("Inside A1 constructor.." +x);
	}
	public A1(String msg)
	{   // msg=" ";
		System.out.println("The message is:" + msg);
	}
	public A1(boolean y)
	{
		
	}
	public A1(String sq,int y1,double d1){
		
	}
public A1(String sq,double d1,int y1){
		
	}
	
	public void A1method(){
		
		System.out.println("A1");
	}
}
class B1 extends A1{
	public B1()
	{
		super("Hi");
		System.out.println();
		System.out.println("Inside B1 constructor..");
	}
	public void A1method(){
		//super.A1method();
		System.out.println("B1");
	}
}
class C1 extends B1{
	public C1()
	{
		System.out.println("Inside C1 constructor..");
	}
	public void A1method(){
		super.A1method();
		System.out.println("C1");
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C1 cone=new C1();
//cone.A1method();
	A1 aone= new A1(23);
	}

}
