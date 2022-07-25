package com.pack.oops.other;
abstract class Animal{
 abstract void  Livewater();
 abstract void layEggs();
}
class TerrestrialAnimal extends Animal{

	@Override
	void Livewater() {
		// TODO Auto-generated method stub
		System.out.println("Terrestrial Animal not living in water");
	}

	@Override
	void layEggs() {
		// TODO Auto-generated method stub
		System.out.println("Not laying eggs");
		
	}
	
	
}
class Amphibian extends Animal{

	@Override
	void Livewater() {
		// TODO Auto-generated method stub
		System.out.println("living in water");
	}

	@Override
	void layEggs() {
		// TODO Auto-generated method stub
		System.out.println("laying eggs..");
	}
	
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
