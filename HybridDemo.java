package com.demo.hybrid;
interface Rose{
	public void fragrance();
}
class Flower{
	
	public void seasonFlower() {
		System.out.println("some flowers are seasonal..");
	}
}
class RedRose extends Flower implements Rose{

	public void seasonFlower() {
		System.out.println("roses we get throughout the year..");
	}
	
	@Override
	public void fragrance() {
		// TODO Auto-generated method stub
		System.out.println("Nice Fragrance of RedRose..");
	}
	
}
public class HybridDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RedRose r1=new RedRose();
		r1.fragrance();
		r1.seasonFlower();
		
	}

}
