package com.demo.inheritance;

  class Exam {
	  public void questions()
	  {
		  System.out.println("Exams are having questions to solve");
	  }

 }	
public class finalExam extends Exam{
	
	public void BriefQuestions()
	{
		questions();
		System.out.println("Students have to write Brief answers to questions..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalExam fex1=new finalExam();
		fex1.BriefQuestions();
		
	}
	
}

