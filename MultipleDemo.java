package com.pack.oops.other;
interface flyingObject {
	
	public void fly();
	public void wings();
}
interface flyingVehicle
{
	public void pilot();
		
}
class Aeroplane implements flyingObject,flyingVehicle{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flying in air..");
	}

	@Override
	public void wings() {
		// TODO Auto-generated method stub
		System.out.println("it has wings");
	}

	@Override
	public void pilot() {
		// TODO Auto-generated method stub
		System.out.println("Pilot is handling aeroplane..");
	}
	
	
}

public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Aeroplane jet=new Aeroplane();
 jet.fly();
 jet.wings();
 jet.pilot();
		
		
	}

}
