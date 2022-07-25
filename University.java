package com.pack.oops;
//super class
class FacultyMaths{
	int  student_rollno[];
	 String className;
	  String class_time;
	  public void announceClass()
	  {
		 System.out.println("The class is"+ className);
		  System.out.println("The class time is"+ class_time);
     }}
//subclass
class MathsStudent extends FacultyMaths
{
int rollno;
 public void announceClass()
 {
	// FacultyMaths fm1=new FacultyMaths();
	// fm1.className="Real Analysis";
	// fm1.class_time="3.30 p.m.";
	// fm1.announceClass();
	 super.announceClass();
 }
}
public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	MathsStudent ms1=new MathsStudent();
		ms1.announceClass();
	}

}
