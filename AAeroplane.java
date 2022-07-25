package com.pack.oops;
interface skeleton{
	public void features();
}
interface FlyingObject{
   public static final int wing = 0;
   public void fly();
	public void wings();
}
interface AirTransport{
	public void engine();
}
interface Engine{
		
}
class AirPlane{
	
}
class Bird implements FlyingObject{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wings() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AAeroplane extends AirPlane implements FlyingObject,AirTransport,Engine {

		@Override
	public void engine() {
		System.out.println("Aeroplane is having engine");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane is flying in sky");
	}

	@Override
	public void wings() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane has 2 wings");
	}

	public static void main(String [] args)
	{
		AAeroplane aer=new AAeroplane();
		aer.engine();
		aer.fly();
		aer.wings();
		
	}
}
