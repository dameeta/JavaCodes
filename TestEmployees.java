package com.test.inheritance;

class Employee{
	int emp_id;
	public Employee()
	{
		System.out.println("default Employee..");
	}
	public Employee(int id)
	{
		this.emp_id=id;
		System.out.println("Employee id is:" +id);
	}
	
}
class Manager extends Employee{
String dept;
String skill;

public Manager()
{
System.out.println("Inside default Manager..");	
}
	public Manager(int i) {
		super(i);
		System.out.println("Manager Id is:"+ i);
	}
	public Manager(String skill)
	{
		this.skill=skill;
		System.out.println("Inside manager skill" +skill);
	}
}
class Secretary extends Manager{
	int i;
	String skill;
	public Secretary()
	{
	System.out.println("Inside default Secretary.");	
	}
	public Secretary(String skill)
	{
		super(skill);
		System.out.println("Inside Secretary skill...");
	}
}

public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Secretary s1=new Secretary();
Secretary s2=new Secretary("ShortHand");
Manager m1=new Manager(123);
	}

}
