package com.demo.multilevel;
class A
{
public A() {
	System.out.println("Inside A Constructor..");
}
}
class B extends A{
	public B() {
		System.out.println("Inside B Constructor..");
	}
	
}
class C extends B{
	public C() {
		System.out.println("Inside C Constructor..");
	}
}
public class multiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1=new C();
		
		
	}

}
