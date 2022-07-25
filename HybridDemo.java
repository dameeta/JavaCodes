package com.pack.oops;

interface Rose{
	public void thorn();
}
class RedRose{
	
	public void Redrosemethod()
	{
		System.out.print("Redrose");
	}
}
interface  YellowRose{
	public void yellorose();
}
class OrangeRose  extends RedRose  implements Rose,YellowRose{

	@Override
	public void thorn() {
		// TODO Auto-generated method stub
		System.out.println("OrangeRoses have thorns on stem");
	}
	public void Orangemethod()
	{
		Redrosemethod();
		yellorose();
		System.out.print(" forms");
		System.out.print(" an OrangeRose");
	}
	@Override
	public void yellorose() {
		// TODO Auto-generated method stub
		System.out.print(" and YellowRose");
	}
	
	
	
}
public class HybridDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrangeRose or1=new OrangeRose();
		or1.Orangemethod();
		
	}

}
