package com.demo.abastraction;

abstract class Pentium{
	
public abstract void ram();
public abstract void speed();
public abstract void hdd();


}
public class CoreI7 extends Pentium{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoreI7 icore=new CoreI7();
		icore.ram();
		icore.speed();
		icore.hdd();
	}

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("coreI7 are having good ram system");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("speed is fast");
	}

	@Override
	public void hdd() {
		// TODO Auto-generated method stub
		System.out.println("good hdd features");
	}

}
