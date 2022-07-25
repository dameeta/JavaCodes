package com.pack.oops;
class Student{
	
}
class SyStudent extends Student{
	
	
}
class StudentService{
	
	public String Scorecard(Student s1)
	{
		return "this is studentScore";
	}
}

public class Polymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentService ss1=new StudentService();
SyStudent s1=new SyStudent();
//polymorphic argument
ss1.Scorecard(s1);
Student st1=new Student();

Student sst1= 	s1;	

if(st1 instanceof SyStudent)
{
System.out.println("yes");	
}

else
{
System.out.println("No");	
}


	}

}
