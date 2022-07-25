package com.pack.oops;

class Trustee{
	public void donation()
	{
		System.out.println("trustee donates..");
	}
}
class Principal extends Trustee{
	public void runschool()
	{
		super.donation();
		System.out.println("Principal runs school..");
	}
	
}
class Supervisor extends Principal{
	
	public void adminsSchool()
	{
		System.out.println("Supervisor admins schools");
	}
	
}
class HeadofDept extends Supervisor{
	public void headingDept()
	{
		
		System.out.println("HOD heads department...");
	}
}
class MathsDept  extends HeadofDept{
	public void headingDept()
	{
		
		System.out.println("Maths HOD heads department...");
	}
}
class BiologyDept extends HeadofDept{
	public void headingDept()
	{
		
		System.out.println("Biology HOD heads department...");
	}
}
class ChemistryDept extends HeadofDept{
	public void headingDept()
	{
		super.headingDept();
		System.out.println("ChemistryHOD heads department...");
	}
}
public class HierarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChemistryDept chd=new ChemistryDept();
chd.headingDept();
Principal p1=new Principal();
p1.runschool();

	}

}
