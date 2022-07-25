package com.pack.oops;
interface mother{
	public String mothername();
}
interface father   {
	public String fathername();
}
public class Son extends University implements father,mother{

	public void sonname()
	{
		Son s1=new Son();
		
	System.out.println("Roshan"+s1.mothername()+s1.fathername());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son s2=new Son();
s2.sonname();
	}

	@Override
	public String mothername() {
		// TODO Auto-generated method stub
		return "Aruna";
	}

	@Override
	public String fathername() {
		// TODO Auto-generated method stub
		 return "Prakash";
	}

}
