package controlStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter age of candidate");
		Scanner sc=new Scanner(System.in);
		int age= sc.nextInt();
		
		if(age>18)
		{
			
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
			
		}
		
		
				
		
	}

}
