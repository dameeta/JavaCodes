package com.pack.oops;
class Employee {
	int id=100;
	String ename="Sunil";
	double salary=45000;
	
	public String getDetails()
	{
		return "The Details of employee are" + id + ename + salary;
	}
	public String toString()
	{
		return "the employee is"+ id +ename +salary;
	}
}

class Manager extends Employee{
	
	String dept= "Sales";
	public String getDetails()
	{
		
		return "The Details of Manager are" + super.getDetails() + dept;
	}
	@Override
	public String toString() {
		return "Manager [dept=" + dept + "]";
	}
	
}
class Secretary extends Employee{
	
	String skill="shorthand";
	public String getDetails()
	{
		return "The Details of Secretary are:"+skill;
	}
	@Override
	public String toString() {
		return "Secretary [skill=" + skill + "]";
	}
	
	
}
public class VirtualMethodInvocationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Polymorphic behaviour of an object
		Employee e1=new Manager();
	System.out.println(e1.getDetails());
		System.out.println(e1);
		
	/*
	 * Employee [] staff=new Employee[2]; staff [0] =new Manager(); staff [1] =new
	 * Secretary(); for(int i=0;i<staff.length;i++) { System.out.println(staff[i]);
	 * }
	 */
	}

}
