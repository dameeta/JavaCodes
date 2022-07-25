package com.pack.oops;

class Animal{
public void eat(){
	System.out.println("some animals eats grass and some eats meats");
}	
}
class Lion extends Animal  {
	
	public void eat()
	{
		super.eat();
		System.out.println("Lion eats animal..");
	}
}
public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion l1=new Lion();
		l1.eat();
		
	}

}
