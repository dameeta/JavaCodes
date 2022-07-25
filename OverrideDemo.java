package com.pack.oops;
class A11{
	
	int x=89;
	
	public void methodA(){
		System.out.println("inside method A");
		
	}
}

class B12 extends A11{
	
	public void BMethod()
	{  //x=56;
		System.out.println(x);
		methodA();
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B12 bb=new B12();
		bb.BMethod();
	}

}
