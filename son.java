package com.demo.inheritance;

interface mother{
	
	public void haircolor();
	public void motherName();
}
interface father{
	
	public void eyescolor();
	public void fatherName();

}

public class son implements mother,father{
	public void DescribeSon()
	{
		System.out.println("The details of Son are......");
		motherName();
		fatherName();
		haircolor();
		eyescolor();
		
	}
	

	@Override
	public void haircolor() {
		// TODO Auto-generated method stub
		System.out.println("Haircolor is brown");
	}

	@Override
	public void motherName() {
		// TODO Auto-generated method stub
		
		System.out.println("Mother name is Mita Ghosh");

		}

		@Override
		public void eyescolor() {
			// TODO Auto-generated method stub
			System.out.println("Sons eye color is brown");
		}

		@Override
		public void fatherName() {
			// TODO Auto-generated method stub
			System.out.println("Father Name is Ravi Ghosh");
		}

		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		son s1=new son();
		s1.DescribeSon();
		
	}}
