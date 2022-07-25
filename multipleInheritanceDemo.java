package com.pack.oops;
interface A{
	
	public void Amethod();
}


interface B{
	public void Bmethod();

}


class C  implements A,B{

	
	@Override
	public void Bmethod() {
		// TODO Auto-generated method stub
	System.out.println("B");	
	}

	@Override
	public void Amethod() {
		// TODO Auto-generated method stub
		System.out.println("A");	

	}
	
	
}


public class multipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
