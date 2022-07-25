package com.pack.oops;

public class Person {

	String Wrk;
	int tme;
	public void performRole(String work,int time)
	{
		Wrk=work;
		tme = time;
		System.out.println("The person is house wife at home  started" + work + time +"a.m.");
		
	}
	public void performRole()
	{
		System.out.println("Going to Office at 11 am  performing role of Employee");
	}
	
	public void performRole(int time)
	{
		System.out.println("The person is playing with kids performing role as a mother at " + time +"p.m.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1=new Person();
p1.performRole();
String w="work";
int t=8;
p1.performRole(w,t);
p1.performRole(6);
		
Person pe=new Person();
System.out.println(pe);
	}

}
